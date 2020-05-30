$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("regression/info_News_ContactUs.feature");
formatter.feature({
  "line": 1,
  "name": "InfoNewsContact",
  "description": "",
  "id": "infonewscontact",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5704396600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Navigate Info Pages",
  "description": "",
  "id": "infonewscontact;navigate-info-pages",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Info Pages link display in main menu",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User do mouse hover on InfoPages link in main menu on homepage",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "select About Us link",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "navigate to the About Us page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "select Privacy policy link",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "navigate to the Privacy Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Info_News_ContactUs_StepDef.infoPagesLinkDisplayInMainMenu()"
});
formatter.result({
  "duration": 232510300,
  "status": "passed"
});
formatter.match({
  "location": "Info_News_ContactUs_StepDef.userDoMouseOverOnInfoPagesLinkInMainMenuOnHomepage()"
});
formatter.result({
  "duration": 5767600,
  "status": "passed"
});
formatter.match({
  "location": "Info_News_ContactUs_StepDef.selectLinkAboutUs()"
});
formatter.result({
  "duration": 4527763200,
  "status": "passed"
});
formatter.match({
  "location": "Info_News_ContactUs_StepDef.navigateToTheAboutUsPage()"
});
formatter.result({
  "duration": 45374200,
  "status": "passed"
});
formatter.match({
  "location": "Info_News_ContactUs_StepDef.selectPrivacyPolicyLink()"
});
formatter.result({
  "duration": 1384011000,
  "status": "passed"
});
formatter.match({
  "location": "Info_News_ContactUs_StepDef.navigateToThePrivacyPage()"
});
formatter.result({
  "duration": 38499000,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 415842200,
  "status": "passed"
});
formatter.before({
  "duration": 2740894000,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "NewsPage",
  "description": "",
  "id": "infonewscontact;newspage",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User click on News in main menu tab",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Navigate to the News Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Info_News_ContactUs_StepDef.userClickOnNews()"
});
formatter.result({
  "duration": 4013772700,
  "status": "passed"
});
formatter.match({
  "location": "Info_News_ContactUs_StepDef.navigateToNewsPage()"
});
formatter.result({
  "duration": 36843900,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 464402700,
  "status": "passed"
});
});