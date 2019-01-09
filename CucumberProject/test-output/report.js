$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("bdd.feature");
formatter.feature({
  "line": 1,
  "name": "demoqa",
  "description": "",
  "id": "demoqa",
  "keyword": "Feature"
});
formatter.uri("map.feature");
formatter.feature({
  "line": 1,
  "name": "Using map",
  "description": "",
  "id": "using-map",
  "keyword": "Feature"
});
formatter.before({
  "duration": 377959,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "",
  "description": "",
  "id": "using-map;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 4,
      "value": "#Data-driven using map"
    }
  ],
  "line": 5,
  "name": "user is on new contact page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters his/her credentials",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname"
      ],
      "line": 7
    },
    {
      "cells": [
        "Tejas",
        "Patel"
      ],
      "line": 8
    },
    {
      "cells": [
        "Pratikshep",
        "Deshmukh"
      ],
      "line": 9
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user provides position",
  "rows": [
    {
      "cells": [
        "position",
        "salary"
      ],
      "line": 11
    },
    {
      "cells": [
        "QA",
        "less"
      ],
      "line": 12
    },
    {
      "cells": [
        "Developer",
        "more"
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "MapContactStepDef.user_is_on_new_contact_page()"
});
formatter.result({
  "duration": 133930517,
  "status": "passed"
});
formatter.match({
  "location": "MapContactStepDef.user_enters_hisOrHer_credentials(DataTable)"
});
formatter.result({
  "duration": 3317056,
  "status": "passed"
});
formatter.match({
  "location": "MapContactStepDef.user_provides_position(DataTable)"
});
formatter.result({
  "duration": 309995,
  "status": "passed"
});
formatter.match({
  "location": "MapContactStepDef.close_the_browser()"
});
formatter.result({
  "duration": 29451,
  "status": "passed"
});
formatter.after({
  "duration": 106101,
  "status": "passed"
});
});