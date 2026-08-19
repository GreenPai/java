package hello.itemservice.repository;

import lombok.Data;

/**
 * 왜 리포지토리 패키지에 있는가?
 * 리포지토리에서 주로 사용하기 때문에
 */
    @Data
    public class ItemUpdateDto {
        private String itemName;
        private Integer price;
        private Integer quantity;

        public ItemUpdateDto() {
        }

        public ItemUpdateDto(String itemName, Integer price, Integer quantity) {
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }
    }
