import java.util.Date;

class LineItem {

    private int itemId;
    private String itemName;
    private Date manfacturedDate;

    public LineItem(int itemId, String itemName, Date manfacturedDate) {
        super();
        this.itemId = itemId;
        this.itemName = itemName;
        this.manfacturedDate = manfacturedDate;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Date getManfacturedDate() {
        return manfacturedDate;
    }

    public void setManfacturedDate(Date manfacturedDate) {
        this.manfacturedDate = manfacturedDate;
    }

    @Override
    public String toString() {
        return "LineItem [itemId=" + itemId + ", itemName=" + itemName + ", manfacturedDate=" + manfacturedDate + "]";
    }

}