package tools;

public class MyInterface {
    interface Language {
        void getName(String name);
    }

    class ProgrammingLanguage implements Language {
        public void getName(String name) {
            System.out.println("Programming Language: " + name);
        }
    }

    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface();
        myInterface.runExample();
    }

    private void runExample() {
        ProgrammingLanguage java = new ProgrammingLanguage();
        java.getName("Java");
    }
}
