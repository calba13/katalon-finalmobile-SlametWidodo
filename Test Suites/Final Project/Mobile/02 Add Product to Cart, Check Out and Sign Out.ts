<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>02 Add Product to Cart, Check Out and Sign Out</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>6975a0a3-ba54-4778-9dde-85b9be6b0db3</testSuiteGuid>
   <testCaseLink>
      <guid>13ff5379-80d4-44b5-803d-435c00dbd4b1</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC-Common/TC-Open Application Mobile</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>64e6d8ec-11a5-4768-92f6-47e8c85b9eef</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC-Login/TC-Login</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>21510736-2ca0-4cd3-ab8c-7d3aad5bc5fc</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>a37b01d1-fea0-428c-b3aa-f3921fe22d49</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>794dcd80-05d2-4666-8172-bf20662f2016</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC-Cart/TC-Add Item</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>ef2d0d24-bfe2-4ba1-9746-a6d5ce84c9f0</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Cart/ListProduct</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>ef2d0d24-bfe2-4ba1-9746-a6d5ce84c9f0</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>categoryItem</value>
         <variableId>d384d3c9-cbc1-480f-9b02-1d77f2a1a8a5</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>ef2d0d24-bfe2-4ba1-9746-a6d5ce84c9f0</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>categoryName</value>
         <variableId>3c435ac7-2360-418e-912c-3a68d41a718f</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>ef2d0d24-bfe2-4ba1-9746-a6d5ce84c9f0</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>quantity</value>
         <variableId>664931db-2214-4272-85a2-1a46e4f0aba8</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>d9e3f954-f574-461b-afff-07b2878086b2</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC-Cart/TC-CheckOut</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>c596f55c-b0f0-45cb-84df-0e44ab884dd4</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC-SignOut/TC-SignOut</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>
