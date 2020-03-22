$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SimpleFormDemo.feature");
formatter.feature({
  "line": 2,
  "name": "Fill in simple forms",
  "description": "",
  "id": "fill-in-simple-forms",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SimpleFormDemo"
    }
  ]
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Single Field Input",
  "description": "",
  "id": "fill-in-simple-forms;single-field-input",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User navigates to simple form webpage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters \"\u003cMessage\u003e\" into message textbox",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User clicks on show message button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User verifies message is displayed as \"\u003cMessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "fill-in-simple-forms;single-field-input;",
  "rows": [
    {
      "cells": [
        "Message"
      ],
      "line": 10,
      "id": "fill-in-simple-forms;single-field-input;;1"
    },
    {
      "cells": [
        "This is a message"
      ],
      "line": 11,
      "id": "fill-in-simple-forms;single-field-input;;2"
    }
  ],
  "keyword": "Examples"
});
