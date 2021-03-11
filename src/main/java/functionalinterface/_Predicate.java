package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println(isPhoneNumberValid("777555444"));
        System.out.println(isPhoneNumberValid("787555444"));
        System.out.println(isPhoneNumberValid("77755542"));
        System.out.println();

        System.out.println(isPhoneNumberValidPredicate.test("777555444"));
        System.out.println(isPhoneNumberValidPredicate.test("787555444"));
        System.out.println(isPhoneNumberValidPredicate.test("77755542"));
        System.out.println();

        System.out.println(containsNumber3.test("777555444"));
        System.out.println(containsNumber3.test("777333544"));
        System.out.println(containsNumber3.test("899000553"));
        System.out.println();

        System.out.println("Is phone number valid and contains number 3: " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("777553444"));
        System.out.println("Is phone number valid and contains number 3: " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("777555444"));
        System.out.println("Is phone number valid and contains number 3: " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("777533444"));
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("777") && phoneNumber.length() == 9;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("777") && phoneNumber.length() == 9;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}
