package online.wubianhu.myjavanotes.studynotes.poly.polyArray;

public class PolyArray {
    public static void main(String[] args) {
        //创建一个person对象，2个stuent对象，2个teacher对象，统一放在数组里面，并且调用每个数组的say方法
        Person[] persons = new Person[5];
        persons[0] = new Person("person01", 20);
        persons[1] = new Student("xiaoming",12);
        persons[2] = new Student("xiaohong",13);
        persons[3] = new Teacher("ma",45,20000);
        persons[4] = new Teacher("YAO",55,14000);

        for (int i = 0; i < persons.length; i++) {
            //person[i]的编译类型是person，运行类型是根据实际情况由jvm来判断
            System.out.println(persons[i].say());
            if (persons[i] instanceof Teacher) {
                ((Teacher) persons[i]).teach();
            } else if (persons[i] instanceof Student) {
                ((Student) persons[i]).study();
            }else {
                System.out.println("类型不正确");
            }
        }

        //循环遍历多态数组，调用say方法
    }
}
