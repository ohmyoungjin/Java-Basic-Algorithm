package main.java.study.extend;

public class ItemMain {

    public static void main(String[] args) {
        UpdateItemDto updateItemDto = new UpdateItemDto("maeng2", 10000, 10, "jpa", "111", "myoung", "1234", "myoungjin", "oh");

        Book book = new Book();

        book.changeItem(updateItemDto);



    }
}
