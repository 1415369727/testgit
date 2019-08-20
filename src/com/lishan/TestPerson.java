package com.lishan;

public class TestPerson {
    public static TestPerson t1 = new TestPerson();
    public static TestPerson t2 = new TestPerson();

    {
        System.out.println("构造块");
    }

    static {
        System.out.println("静态块");
    }

    public static void main(String[] args) {
     /*   fun(13, 19, new Person() {
            @Override
            public int aaa(int a, int b) {
                return a+b;
            }
        });
        fun(12,13,(a,b)-> a+b);*/
       /* loop: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int h = 0; h < 10; h++) {
                        if (h == 6) {
                            break loop;
                        }
                        System.out.print(h);
                    }
                }
            }
        }
        System.out.println("\nI'm here!");*/
      /* char a='a'+1;
        System.out.println(a);*/
       /* Object o=new Object(){
            public boolean equals(Object obj){
                return false;
            }
        };
        System.out.println(o.equals("Fred"));*/
        /* TestPerson y=new TestPerson();*/
        int x = 20, y = 10, a = 0, b = 0;
        fun(x, y, a, b);
        System.out.println(" %d, %d" + a + b);
    }

    public static int fun(int a, int b, Person p) {
        System.out.println(a + b);
        return p.aaa(a, b);
    }

    public void a() {
    }

    static void fun(int x, int y, int a, int b) {
        a = x + y;
        b = x - y;
    }
}
