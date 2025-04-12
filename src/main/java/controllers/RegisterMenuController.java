package controllers;

import models.Result;

import java.util.Scanner;

public class RegisterMenuController {
    public static Result register(final String username, final String password, final String confirmPassword, final String nickname, final String email, final String gender,
                                  Scanner scanner){}
    //optional: SHA-256
    public static String generateRandomPassword() {}
    public static boolean isEmailValid(final String email) {}
    public static boolean isPasswordValid(final String password){}
}
