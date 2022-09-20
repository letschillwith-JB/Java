package Day7;

public class JavaBean {
    JavaBean(){

    }
    private int duration;
    private String name;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        JavaBean obj1 = new JavaBean();
        JavaBean obj2 = new JavaBean();

        obj1.setDuration(1);
        obj1.setName("XYZ");
        System.out.println("Duration in hrs "+obj1.getDuration()+", Name "+obj1.getName());

        obj2.setDuration(2);
        obj2.setName("ABC");
        System.out.println("Duration in hrs "+obj2.getDuration()+", Name "+obj2.getName());
    }
}
