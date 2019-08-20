#author: Jose Santiago Molano Perdomo, jose.molano@upb.edu.co
Feature: Google Translate
  As an User
  I want to translate sentences from spanish
  So I can communicate to non native spanish speakers

  @TranslateFromApp
  Scenario Outline:Translate using Google Translate App from Browser
    Given Santiago is in Google WebSite
    When He translates "<sentence>" from "<translateFrom>" to "<translateTo>"
    Then He should see his "<sentence>" was translated to "<sentenceTranslated>"
    Examples:
      | translateFrom | translateTo | sentence | sentenceTranslated |
      | Español       | alemán      | Hola     | Hallo              |
      | Español       | inglés      | Hola     | Hello              |
      | Español       | tailandés   | Hola     | สวัสดี             |

  @TranslateFromGoogleSearch
  Scenario: Translate using Google Search
    Given Santiago is in Google WebSite
    When he search "Ciao, mi chiamo Santiago" to be translated by Google from italian to Norwegian
    Then he sentence "Ciao, mi chiamo Santiago" was translated to "Hei, jeg heter Santiago" from Google Search