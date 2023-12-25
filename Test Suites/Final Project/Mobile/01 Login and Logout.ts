<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>01 Login and Logout</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>c4154c54-cb59-4c8f-bd8c-c458404f7f47</testSuiteGuid>
   <testCaseLink>
      <guid>55cf760e-0bdb-496c-99e2-d529ae6834f5</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC-Common/TC-Open Application Mobile</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>55cad93f-ea54-4aa2-9a8c-98e79b96ae34</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC-Login/TC-Login</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>8166a716-313d-4250-8139-c9eae643ac47</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/SignUp/userProfile</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>8166a716-313d-4250-8139-c9eae643ac47</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>username</value>
         <variableId>21510736-2ca0-4cd3-ab8c-7d3aad5bc5fc</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>8166a716-313d-4250-8139-c9eae643ac47</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>a37b01d1-fea0-428c-b3aa-f3921fe22d49</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>df70e29d-e19f-4b80-a5d9-d1a07b86cc6e</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC-SignOut/TC-SignOut</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>
