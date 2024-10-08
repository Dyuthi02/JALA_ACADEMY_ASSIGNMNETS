/* 09. Create a PRIVATE or PROTECTED interface and print the values as above scenario
 * 10. Create an interface with private, public and protected fields
 * 11.  Create an interface with static final variable
 */

package JALA_ACADEMY_ASSIGNMNETS.Interfaces;


interface I1 {

    public int num1 = 18;
    static final int num2 = 20;
    final int num3 = 36;
    // private int num4 = 46;  - error
    // protected int num5 = 52; - error
}

class InterfacePrivateProtected implements I1 {

    public static void main(String[] args) {
        InterfacePrivateProtected if9 = new InterfacePrivateProtected();
        System.out.println(if9.num1 + " " + if9.num2);
    }
/* NOTE :
1. Interface in Java is similar to class but, it contains only abstract methods and
   fields which are final and static.

2. If the members of the interface are private you cannot provide implementation to
   the methods or, cannot access the fields of it in the implementing class.

3. The protected members can be accessed in the same class or,the class inheriting it.
   But, we do not inherit an interface we will implement it.

 */
}