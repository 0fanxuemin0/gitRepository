package com.mifan.test;


import javax.swing.text.html.HTMLDocument;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Created by fanxuemin on 2018/6/19.
 */
 public   class  test
{
    static{
        a=2;
    }
    static int a=1;
    int b=2;
    static Set s=new HashSet();
    {
        s.add(1);
        s.add(1);
    }
    public static void hello(){
        System.out.println("hello");
    }
    public  void hello1(){
        System.out.println("hello1");
    }
    public static void main(String[] args) {
//
//        String[] a={"1","2","3"};
//        System.out.println(a.length);
//        System.out.println(a[3]);
//        List b=new ArrayList();
//        b.add(1);
//        System.out.println(b.size());
//        System.out.println(b.get(2));
//        test t=new test();
//        System.out.println(s.toString());
/*String a="qwe";
        System.out.println(a.hashCode());
Map map=new HashMap();
        Vector v=new Vector();*//*
        List l=new ArrayList();
        l.add(1);
        l.add("");
        System.out.println(l.contains(1));*/

/*        Integer b=null;
        System.out.println(b+1);*/
    /*    System.out.println(null+"1234");

        testentity test=new testentity();

        Map m=new HashMap();
        System.out.println(m.values());
        StringBuffer s=new StringBuffer();
        System.out.println(s.toString());*//*
    int i=new Integer(null);
        System.out.println(i);*/

 /*       List<String> list= Arrays.asList("123,,23,".split(","));

            if(Pattern.matches("([0-9]{4}-[0-9]{2}-[0-9]{2} [0-9]{2}:[0-9]{2}:[0-9]{2})", "1232-32-12 00:0:00")){
                System.out.println("success");
            }
            else{
                System.out.println("false");
            }*/
/* Integer i=new Integer("7");
        Integer b=new Integer(7);
        if(i==b){
            System.out.println("true");*/

           /* System.out.println((Integer)null);
        System.out.println(null=="1"?1:2);*/
//        System.out.println(1==new Integer(1)?1:2);
       /* if (Pattern.matches("(\\d+(,\\d+)*)", "")){
            System.out.println("true");
        }*/
       /*Map m=new HashMap();
        m.put("123","434");
        if (m.containsKey("123")){
            System.out.println("trye");
        }*/

//        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
//        String a="2017-01-03 09:01:09";
//        try {
//            System.out.println(s.format(s.parse(a)));
//        } catch (ParseException e) {
//            e.printStackTrace();
//            e.printStackTrace();
//        }
      /*  StringBuffer ruleBuffer=new StringBuffer();
        Set contractIdSet =new HashSet();
        contractIdSet.add("123");
        Iterator i=contractIdSet.iterator();
         System.out.println(i.next());*/
            Double b=2.0;
        System.out.println(b);
        System.out.println(new BigDecimal(2).setScale(2));
    }
}
