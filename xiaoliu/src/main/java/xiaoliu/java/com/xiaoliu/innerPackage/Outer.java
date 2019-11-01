package xiaoliu.java.com.xiaoliu.innerPackage;

//这是一个外部类
public class Outer {

    //1 定义一个外部类变量
    private String usename;

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    //这是内部类
    public class Inner {

        //3 定义一个内部类变量
        private String innerName;

        public String getInnerName() {
            return innerName;
        }

        public void setInnerName(String innerName) {
            this.innerName = innerName;
        }
    }

    public static void main(String[] args) {
        // 2 创建一个外部类对象
        Outer outer = new Outer();

        //4 创建内部类对象
        Inner inner = outer.new Inner();

        //5 调用内部类成员变量
        inner.setInnerName("I am innername");
        System.out.println(inner.getInnerName());
    }


}
