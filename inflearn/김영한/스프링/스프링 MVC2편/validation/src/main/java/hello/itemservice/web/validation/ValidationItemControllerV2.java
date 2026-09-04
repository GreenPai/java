package hello.itemservice.web.validation;

import hello.itemservice.domain.item.Item;
import hello.itemservice.domain.item.ItemRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Controller
@RequestMapping("/validation/v2/items")
@RequiredArgsConstructor
public class ValidationItemControllerV2 {

    private final ItemRepository itemRepository;
    private final ItemValidator itemValidator;

    // 컨트롤러 호출 될때마다 자동으로 검증
    @InitBinder
    public void init(WebDataBinder dataBinder){
        dataBinder.addValidators(itemValidator);
    }

    @GetMapping
    public String items(Model model) {
        List<Item> items = itemRepository.findAll();
        model.addAttribute("items", items);
        return "validation/v2/items";
    }

    @GetMapping("/{itemId}")
    public String item(@PathVariable long itemId, Model model) {
        Item item = itemRepository.findById(itemId);
        model.addAttribute("item", item);
        return "validation/v2/item";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("item", new Item());
        return "validation/v2/addForm";
    }


    /**
     *  BindingResult를 사용하는 방식입니다.
     *  앞선 방식에서의 타입 오류 시 컨트롤러에서 확인을 하지 못했지만
     *  BindingResult는 오류 메시지를 받아줍니다.
     *  그리고 따로 ModelAttribute를 사용하지 않아도 자동으로 전달이 됩니다.
     */


    /**
     *
     * @param bindingResult
     * bindingResult는 Errors를 인터페이스로 상속 받을 것으로 Errors를 사용해도 됩니다.
     * 하지만 Errors는 단순 저장, 조회만을 제공하기 때문에 관례상 bindingResult를 많이 사용합니다.
     */


    /*
    @PostMapping("/add")
    public String addItemV1(@ModelAttribute Item item, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {

        if(!StringUtils.hasText(item.getItemName())){
            bindingResult.addError(new FieldError("item","itemName", "상품 이름은 필수입니다."));
        }

        if(item.getPrice() == null || item.getPrice() < 1000 || item.getPrice() > 1000000){
            bindingResult.addError(new FieldError("item","price", "가격은 1,000~ 1,000,000 까지 허용합니다."));
        }i

        if(item.getQuantity() == null || item.getQuantity()>9999){
            bindingResult.addError(new FieldError("item","quantity", "수량은 최대 9,999까지 허용합니다"));
        }

        // 특정 필드가 아닌 복합 룰 검증
        if (item.getPrice() != null && item.getQuantity() != null){
            int resultPrice = item.getPrice() * item.getQuantity();
            if(resultPrice<10000){
                bindingResult.addError(new ObjectError("item", "가격 * 수량의 합은 10,000 이상이어야 합니다"));

            }
        }

        // 검증에 실패하면 다시 입력 폼으로
        // ModelAttribute에 bindingResult를 담지 않는 이유는 자동으로 담겨서 보내기 때문이다.
        if (bindingResult.hasErrors()){
            log.info("errors = {}", bindingResult);
            return "validation/v2/addForm";
        }

        //검증 성공 로직

        Item savedItem = itemRepository.save(item);
        redirectAttributes.addAttribute("itemId", savedItem.getId());
        redirectAttributes.addAttribute("status", true);
        return "redirect:/validation/v2/items/{itemId}";
    }
    */


    /**
     *  V1의 문제점인 이전의 데이터를 담아주는 과정을 추가.
     *  bindingResult.addError(new FieldError("item","price", item.getPrice(), false, null ,null,"상품 이름은 필수입니다."));
     */

    /*
    @PostMapping("/add")
    public String addItemV2(@ModelAttribute Item item, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {

        if(!StringUtils.hasText(item.getItemName())){
            bindingResult.addError(new FieldError("item","itemName", item.getItemName(), false, null ,null,"상품 이름은 필수입니다."));
        }

        if(item.getPrice() == null || item.getPrice() < 1000 || item.getPrice() > 1000000){
            bindingResult.addError(new FieldError("item","price", item.getPrice(), false, null ,null,"상품 이름은 필수입니다."));
        }

        if(item.getQuantity() == null || item.getQuantity()>9999){
            bindingResult.addError(new FieldError("item","quantity", item.getQuantity(), false, null ,null,"상품 이름은 필수입니다."));
        }

        // 특정 필드가 아닌 복합 룰 검증
        if (item.getPrice() != null && item.getQuantity() != null){
            int resultPrice = item.getPrice() * item.getQuantity();
            if(resultPrice<10000){
                bindingResult.addError(new ObjectError("item", null,null, "가격 * 수량의 합은 10,000 이상이어야 합니다"));

            }
        }

        // 검증에 실패하면 다시 입력 폼으로
        // ModelAttribute에 bindingResult를 담지 않는 이유는 자동으로 담겨서 보내기 때문이다.
        if (bindingResult.hasErrors()){
            log.info("errors = {}", bindingResult);
            return "validation/v2/addForm";
        }

        //검증 성공 로직

        Item savedItem = itemRepository.save(item);
        redirectAttributes.addAttribute("itemId", savedItem.getId());
        redirectAttributes.addAttribute("status", true);
        return "redirect:/validation/v2/items/{itemId}";
    }

     */


    /**
     *   V3
     *  에러 메시지를 디폴트로 하는 것이 아닌 에러 메시지 errors.properties에서 호출해서 사용
     */

    /*
    @PostMapping("/add")
    public String addItemV3(@ModelAttribute Item item, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {

        log.info("objectName={}", bindingResult.getObjectName());
        log.info("target={}", bindingResult.getTarget());


        if(!StringUtils.hasText(item.getItemName())){
            bindingResult.addError(new FieldError("item","itemName", item.getItemName(), false, new String[]{"required.item.itemName"} ,null,null));
        }

        if(item.getPrice() == null || item.getPrice() < 1000 || item.getPrice() > 1000000){
            bindingResult.addError(new FieldError("item","price", item.getPrice(), false, new String[]{"range.item.price"} ,new Object[]{1000,1000000},null));
        }

        if(item.getQuantity() == null || item.getQuantity()>9999){
            bindingResult.addError(new FieldError("item","quantity", item.getQuantity(), false, new String[]{"max.item.quantity"} ,new Object[]{9999},null));
        }

        // 특정 필드가 아닌 복합 룰 검증
        if (item.getPrice() != null && item.getQuantity() != null){
            int resultPrice = item.getPrice() * item.getQuantity();
            if(resultPrice<10000){
                bindingResult.addError(new ObjectError("item", new String[]{"totalPriceMin"},new Object[]{10000, resultPrice}, null));
            }
        }

        // 검증에 실패하면 다시 입력 폼으로
        // ModelAttribute에 bindingResult를 담지 않는 이유는 자동으로 담겨서 보내기 때문이다.
        if (bindingResult.hasErrors()){
            log.info("errors = {}", bindingResult);
            return "validation/v2/addForm";
        }

        //검증 성공 로직

        Item savedItem = itemRepository.save(item);
        redirectAttributes.addAttribute("itemId", savedItem.getId());
        redirectAttributes.addAttribute("status", true);
        return "redirect:/validation/v2/items/{itemId}";
    }
     */


    /**
     *
     * RejectValue 사용
     * bindingResult.addError(new FieldError("item","price", item.getPrice(), false, new String[]{"range.item.price"} ,new Object[]{1000,1000000},null));
     * bindingResult.rejectValue("price", "range", new Object[]{1000,1000000} , null);
     *
     * BindingResult는 규칙이 있다.
     * @ModelAttribute Item item, BindingResult bindingResult 항상 검증하고 싶은 객체 뒤에 온다.
     * 그렇기 때문에 검증 객체를 FieldError 에서 지정할 필요가 없다.
     * rejectValue를 사용해서 단순화 시킬 수 있다.
     * range는 range.item.price이다. item객체, price 필드 다 알고 있으므로 range만 알면 된다.
     */


    /*
    @PostMapping("/add")
    public String addItemV4(@ModelAttribute Item item, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {

        log.info("objectName={}", bindingResult.getObjectName());
        log.info("target={}", bindingResult.getTarget());


        if(!StringUtils.hasText(item.getItemName())){
            // bindingResult.addError(new FieldError("item","itemName", item.getItemName(), false, new String[]{"required.item.itemName"} ,null,null));
            bindingResult.rejectValue("itemName", "required");
        }

        if(item.getPrice() == null || item.getPrice() < 1000 || item.getPrice() > 1000000){
            bindingResult.rejectValue("price", "range", new Object[]{1000,1000000} , null);
        }

        if(item.getQuantity() == null || item.getQuantity()>9999){
            bindingResult.rejectValue("quantity", "max", new Object[]{9999}, null);
        }

        // 특정 필드가 아닌 복합 룰 검증
        if (item.getPrice() != null && item.getQuantity() != null){
            int resultPrice = item.getPrice() * item.getQuantity();
            if(resultPrice<10000){
                bindingResult.reject("totalPriceMin", new Object[]{10000, resultPrice} , null);
            }
        }

        // 검증에 실패하면 다시 입력 폼으로
        // ModelAttribute에 bindingResult를 담지 않는 이유는 자동으로 담겨서 보내기 때문이다.
        if (bindingResult.hasErrors()){
            log.info("errors = {}", bindingResult);
            return "validation/v2/addForm";
        }

        //검증 성공 로직

        Item savedItem = itemRepository.save(item);
        redirectAttributes.addAttribute("itemId", savedItem.getId());
        redirectAttributes.addAttribute("status", true);
        return "redirect:/validation/v2/items/{itemId}";
    }
     */


    /**
     *  검증기를 사용한 V5입니다.
     *  검증하는 부분을 ItemValidator로 따로 구현했으며
     *  직접 호출해서 사용합니다.
     */

    /*
    @PostMapping("/add")
    public String addItemV5(@ModelAttribute Item item, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        // 검증 코드
        itemValidator.validate(item,bindingResult);

        // 검증에 실패하면 다시 입력 폼으로
        if (bindingResult.hasErrors()){
            log.info("errors = {}", bindingResult);
            return "validation/v2/addForm";
        }

        //검증 성공 로직
        Item savedItem = itemRepository.save(item);
        redirectAttributes.addAttribute("itemId", savedItem.getId());
        redirectAttributes.addAttribute("status", true);
        return "redirect:/validation/v2/items/{itemId}";
    }


     */

    /**
     *
     *     검증하는 부분을 컨트롤러가 호출 될 때 사용되게 구현했습니다.
     *
     *     // 컨트롤러 호출 될때마다 자동으로 검증
     *     @InitBinder
     *     public void init(WebDataBinder dataBinder){
     *         dataBinder.addValidators(itemValidator);
     *     }
     *
     *  @Validated 를 사용해서 자동으로 검증을 수행하며 그 결과를 BindingResult에 담아줍니다.
     */

    @PostMapping("/add")
    public String addItemV6(@Validated @ModelAttribute Item item, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {

        // 검증에 실패하면 다시 입력 폼으로
        if (bindingResult.hasErrors()){
            log.info("errors = {}", bindingResult);
            return "validation/v2/addForm";
        }

        //검증 성공 로직
        Item savedItem = itemRepository.save(item);
        redirectAttributes.addAttribute("itemId", savedItem.getId());
        redirectAttributes.addAttribute("status", true);
        return "redirect:/validation/v2/items/{itemId}";
    }

    @GetMapping("/{itemId}/edit")
    public String editForm(@PathVariable Long itemId, Model model) {
        Item item = itemRepository.findById(itemId);
        model.addAttribute("item", item);
        return "validation/v2/editForm";
    }

    @PostMapping("/{itemId}/edit")
    public String edit(@PathVariable Long itemId, @ModelAttribute Item item) {
        itemRepository.update(itemId, item);
        return "redirect:/validation/v2/items/{itemId}";
    }

}

