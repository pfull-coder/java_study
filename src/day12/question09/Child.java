package day12.question09;

 public class Child extends Parent {
        private String name;
        public Child() {
            this("홍길동");  // --> this()가 있으면 super()가 들어가지 않는다.
            System.out.println("Child() call");
        }
        public Child(String name) {
            this.name = name;
            System.out.println("Child(String) call");
        }

}

