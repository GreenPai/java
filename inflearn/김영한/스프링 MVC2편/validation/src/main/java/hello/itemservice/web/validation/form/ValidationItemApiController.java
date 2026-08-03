package hello.itemservice.web.validation.form;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *  정상적으로 작동을 했을 때 과정은 다음과 같습니다.
 *  HTML Form -> ItemSaveForm -> Controller -> Item -> Repository
 *  ItemSaveForm 객체를 만들어야 컨트롤러가 호출이 됩니다.
 *  잘못된 값을 Form을 통해서 받을 시 생기는 문제점은 컨트롤러를 호출하지 못합니다.
 */

/**
 *  ModelAttribute vs RequestBody
 *  ModelAttribute는 각각의 필드 단위로 세밀하게 적용이 됩니다.
 *  특정 필드 타입에 맞지 않는 오류가 발생해도 나머지 필드를 정상 처리가 됩니다.
 *
 *  하지만 RequestBody는 HttpMessageConverter를 사용해서 필드 단위로 적용되는 것이 아닌
 *  전체 객체 단위로 적용이 되기 때문에 성공적으로 컨버터가 작동을 해야 Item객체가 만들어집니다.
 */



/**
 * 생길 수 있는 경우의 수
 * 1. 성공
 * 2. JSON 데이터 오류(ItemSaveForm을 만들지 못함)
 * 3. 검증 오류
 */


@Slf4j
@RestController
@RequestMapping("/validation/api/items")
public class ValidationItemApiController {

    @PostMapping("/add")
    public Object addItem(@RequestBody @Validated ItemSaveForm form, BindingResult bindingResult){

        log.info("API 컨트롤러 호출");

        if (bindingResult.hasErrors()){
            log.info("검증 오류 발생={}",bindingResult);
            return bindingResult.getAllErrors();
        }

        log.info("성공 로직 실행");
        return form;
    }
}
