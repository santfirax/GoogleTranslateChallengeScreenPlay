# Challenge Google Translate

This is a test automation challenge
using [SerenityBDD](https://serenity-bdd.github.io/theserenitybook/latest/index.html), Java and Gradle. The use case is
to translate a sentence using Google Translate.

For this challenge, you need the following tools:

* [JDK 1.8](https://www.oracle.com/technetwork/java/javase/downloads/index.html) or above.
* [Git](https://git-scm.com/) installed.
* [Gradle](https://gradle.org/install/) installed
* Google Chrome and Firefox installed
* Any IDE
* File Enconding: UTF-8.

## Let's get started

To download or clone this project https://github.com/santfirax/GoogleTranslateChallengeScreenPlay.git

`git clone https://github.com/santfirax/GoogleTranslateChallengeScreenPlay.git`

## How to execute the test automation on Google Chrome

`gradle clean test -D webdriver.driver=chrome`

## How to execute the automation on Firefox

`gradle clean test -D webdriver.driver=firefox`

## How to execute the test automation on a web browser using Cucumber tags

Each Scenario is mapped with a tag, Tags available are:

* @TranslateFromApp
* @TranslateFromGoogleSearch

To run first Scenario, run the following command in the
project`gradle clean test -Dcucumber.options="--tags @TranslateFromApp"`

To run the second Scenario, run the following command in the
project `gradle clean test -Dcucumber.options="--tags @TranslateFromGoogleSearch"`

To specify the webdriver, you can use `-D webdriver.driver=myDriver`

To run first Scenario on Google Chrome, run the following
command: `gradle clean test -Dcucumber.options="--tags @TranslateFromApp" -D webdriver.driver=chrome`

To run second Scenario on Firefox, run the following

## Evidence
Evidence can be found on :
`target//site//serenity` in the file index.html
