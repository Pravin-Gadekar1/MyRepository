$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/CreatTask.feature");
formatter.feature({
  "name": "Testing actitime apllication",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Testing ActiTime Login functionality for valid user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "Uese already having Apllication Url",
  "keyword": "Given "
});
formatter.match({
  "location": "ActiTaskStepDef.uese_already_having_apllication_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Also having Username and Password",
  "keyword": "And "
});
formatter.match({
  "location": "ActiTaskStepDef.also_having_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter Username and password and  Clicks on Login button",
  "keyword": "When "
});
formatter.match({
  "location": "ActiTaskStepDef.user_enter_username_and_password_and_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ActiTime Homepage should be Displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ActiTaskStepDef.actitime_homepage_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Closed the browser",
  "keyword": "And "
});
formatter.match({
  "location": "ActiTaskStepDef.closed_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing ActiTime Task Creation  functionality for valid user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "Uese already having Apllication Url",
  "keyword": "Given "
});
formatter.match({
  "location": "ActiTaskStepDef.uese_already_having_apllication_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Also having Username and Password",
  "keyword": "And "
});
formatter.match({
  "location": "ActiTaskStepDef.also_having_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter Username and password and  Clicks on Login button",
  "keyword": "When "
});
formatter.match({
  "location": "ActiTaskStepDef.user_enter_username_and_password_and_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on tasks button",
  "keyword": "And "
});
formatter.match({
  "location": "ActiTaskStepDef.user_click_on_tasks_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "uesr click on add new button and select new task option",
  "keyword": "And "
});
formatter.match({
  "location": "ActiTaskStepDef.uesr_click_on_add_new_button_and_select_new_task_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Main Project dropdown arrow and select Galaxy Corporation",
  "keyword": "And "
});
formatter.match({
  "location": "ActiTaskStepDef.user_click_on_main_project_dropdown_arrow_and_select_galaxy_corporation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on sub Project dropdown arrow and select android prototype",
  "keyword": "And "
});
formatter.match({
  "location": "ActiTaskStepDef.user_click_on_sub_project_dropdown_arrow_and_select_android_prototype()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter task name as ATesting",
  "keyword": "And "
});
formatter.match({
  "location": "ActiTaskStepDef.user_enter_task_name_as_atesting()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select worktype as testing and click on creat task button",
  "keyword": "And "
});
formatter.match({
  "location": "ActiTaskStepDef.user_select_worktype_as_testing_and_click_on_creat_task_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ActiTime Task will be Created",
  "keyword": "Then "
});
formatter.match({
  "location": "ActiTaskStepDef.actitime_task_will_be_created()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Closed the browser",
  "keyword": "And "
});
formatter.match({
  "location": "ActiTaskStepDef.closed_the_browser()"
});
formatter.result({
  "status": "passed"
});
});