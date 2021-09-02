$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/ACreateAccount.feature");
formatter.feature({
  "name": "Register on the given website",
  "description": "         validate registered user",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.scenario({
  "name": "New user registration",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "user is on Application landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.CreateAccount.user_is_on_Application_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on sign in",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.CreateAccount.click_on_sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters emailid in email Id field",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.CreateAccount.user_enters_emailid_in_email_Id_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on create account",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.CreateAccount.user_clicks_on_create_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter your details and create account",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.CreateAccount.enter_your_details_and_create_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate the landing screen with  name and surname",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.CreateAccount.validate_the_landing_screen_with_name_and_surname()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/BLogoutAndLogin.feature");
formatter.feature({
  "name": "Validate the registered user",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.scenario({
  "name": "Logut and login again",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "user is on Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.LogoutLogin.user_is_on_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login with registered email id",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.LogoutLogin.login_with_registered_email_id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on logout",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LogoutLogin.click_on_logout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate the registered user",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.LogoutLogin.validate_the_registered_user()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@class\u003d\u0027account\u0027]/span\"}\n  (Session info: chrome\u003d93.0.4577.63)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.0.0-alpha-5\u0027, revision: \u0027b3a0d621cc\u0027\nSystem info: host: \u0027BLRKEC397121L\u0027, ip: \u002710.79.134.200\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.9\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 93.0.4577.63, chrome: {chromedriverVersion: 92.0.4515.107 (87a818b10553..., userDataDir: C:\\Users\\roopa.walasang\\App...}, goog:chromeOptions: {debuggerAddress: localhost:58305}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 9c266090bcaaa599f28b71afabb01cff\n*** Element info: {Using\u003dxpath, value\u003d//*[@class\u003d\u0027account\u0027]/span}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:196)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:129)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:161)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:582)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:333)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:451)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:394)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:325)\r\n\tat pages.SignInPage1.validateregistereduser(SignInPage1.java:122)\r\n\tat StepDefinitions.LogoutLogin.validate_the_registered_user(LogoutLogin.java:64)\r\n\tat ✽.validate the registered user(file:///C:/Users/roopa.walasang/Downloads/MyAssessment2/src/test/resources/Features/BLogoutAndLogin.feature:9)\r\n",
  "status": "failed"
});
formatter.uri("file:src/test/resources/Features/CAddProductToCart.feature");
formatter.feature({
  "name": "Add a product to cart and checkout",
  "description": "         validate the product details",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.scenario({
  "name": "Add product to cart and checkout",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "User is on the Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.AddproductToCart.user_is_on_the_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login with valid credentials",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.AddproductToCart.login_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add a product to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.AddproductToCart.add_a_product_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Proceed to checkout",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.AddproductToCart.proceed_to_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the product details",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.AddproductToCart.validate_the_product_details()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"partial link text\",\"selector\":\"Blouse\"}\n  (Session info: chrome\u003d93.0.4577.63)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.0.0-alpha-5\u0027, revision: \u0027b3a0d621cc\u0027\nSystem info: host: \u0027BLRKEC397121L\u0027, ip: \u002710.79.134.200\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.9\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 93.0.4577.63, chrome: {chromedriverVersion: 92.0.4515.107 (87a818b10553..., userDataDir: C:\\Users\\roopa.walasang\\App...}, goog:chromeOptions: {debuggerAddress: localhost:51359}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 31544ffc791bf1afbd0dc3d6ab8d2ff5\n*** Element info: {Using\u003dpartial link text, value\u003dBlouse}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:196)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:129)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:161)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:582)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:333)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByPartialLinkText(RemoteWebDriver.java:401)\r\n\tat org.openqa.selenium.By$ByPartialLinkText.findElement(By.java:270)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:325)\r\n\tat pages.CataloguePage1.validproductdetails(CataloguePage1.java:103)\r\n\tat StepDefinitions.AddproductToCart.validate_the_product_details(AddproductToCart.java:81)\r\n\tat ✽.Validate the product details(file:///C:/Users/roopa.walasang/Downloads/MyAssessment2/src/test/resources/Features/CAddProductToCart.feature:11)\r\n",
  "status": "failed"
});
});