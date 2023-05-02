
public class Customer {
    private String name,address,mail,mobile;

    Customer(String name,String mail,String mobile,String address){
        this.name=name;
        this.address=address;
        this.mail=mail;
        this.mobile=mobile;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void print(){
        System.out.println("Name:"+name);
        System.out.println("Mail:"+mail);
        System.out.println("Mobile:"+mobile);
        System.out.println("Address:"+address);
    }
}
