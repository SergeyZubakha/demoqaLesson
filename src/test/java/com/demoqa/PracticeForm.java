package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class PracticeForm {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
        Configuration.pageLoadStrategy = "eager";
        Configuration.screenshots = false;
        Configuration.savePageSource = false;
    }


        @Test
        void TestPracticeForm() {

            open("https://demoqa.com/automation-practice-form");
            $("#firstName").setValue("Kiwi");
            $("#lastName").setValue("Locus");
            $("#userEmail").setValue("kiwi@gmail.com");
            $x("//label[@for='gender-radio-1']").click();
            $("#userNumber").setValue("7111111112");
            $("#dateOfBirthInput").click();
            $x("//select[@class='react-datepicker__month-select']").selectOption("October");
            $x("//select[@class='react-datepicker__year-select']").selectOption("1991");
            $x("//div[@class='react-datepicker__day react-datepicker__day--020 react-datepicker__day--weekend']").click();
            $("#subjectsInput").setValue("M");
            $("#react-select-2-option-0").click();
            $x("//div[@class=' css-yk16xz-control']/div[@class=' css-1hwfws3']/div[@class=' css-1wa3eu0-placeholder']").click();
            $("#react-select-3-option-0").click();
            $x("//div[@class=' css-yk16xz-control']/div[@class=' css-1hwfws3']/div[@class=' css-1wa3eu0-placeholder']").click();
            $("#react-select-4-option-0").click();
            $x("//label[@for='hobbies-checkbox-1']").click();
            $("#currentAddress").setValue("Moscow, Red street 4");
            $("#uploadPicture").uploadFile(new File("/Users/sergeyzubakha/IdeaProjects/demoqaLesson/src/test/data/1c4c8d80-453e-11eb-98cf-803f3a2e6973.png"));

        }
    }

