package main.java.study.extend;

public abstract class Item {
    private String name;
    private int price;
    private int stockQuantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public void changeItem(UpdateItemDto updateItemDto) {
        this.name = updateItemDto.getName();
        this.price = updateItemDto.getPrice();
        this.stockQuantity = updateItemDto.getStockQuantity();
        System.out.println("=========Item=============");

    }
}
