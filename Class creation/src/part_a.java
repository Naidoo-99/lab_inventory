
public class part_a {
    
    private int contactNumber;
    private int quantity;
    private String name;
    private String itemID;
    private String category;
    private String supplierName;
    private String description;   
    private double price;
    
    
    public part_a(String name,String description,int contactNumber,String supplierName,int quantity,String itemID,String category,double price) {
                 super();
                 
                 this.itemID = itemID;
                 this.contactNumber = contactNumber;
                 this.quantity = quantity;
                 this.price = price;
                 this.category = category;
                 this.description = description;
                 this.name = name;
                 this.supplierName = supplierName;
                 
    }
    
    public String getCategory() {
        return category;
}
    
    public String getItemID() {
        return itemID;
}

    public int getContactNum() {
                 return contactNumber;
    }

    public String getName() {
                 return name;
    }
    
    public int getQuantity() {
        return quantity;
}

    public String getDescription() {
                 return description;
    }

   

    public String getSupplierName() {
                 return supplierName;
    }
    
    
    
    
    public void setContactNum(int contactNum) {
        this.contactNumber = contactNum;
}
    
    public void setQuantity(int quantity) {
                 this.quantity = quantity;
    }
    
    
    public void setItemid(String itemID) {
        this.itemID = itemID;
    }
    
    public void setName(String name) {
                 this.name = name;
    }

   
    public void setCategory(String category) {
        this.category = category;
    }
    
    public void setDescription(String description) {
                 this.description = description;
    }

    public void setSupplierName(String supplierName) {
                 this.supplierName = supplierName;
    }

    public void setPrice(double price) {
                 this.price = price;
    }

    @Override
    public String toString() {
                 return (this.name + " " + this.itemID + " " +this.supplierName+" "+this.category+" "+this.price+" "+this.contactNumber+" "+this.quantity+" "+this.description+" ");
    }
    
   
    
    
}




