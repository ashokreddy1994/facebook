Feature:Gmail home page title
@title
Scenario: verify the gmail title

Given launch gmail site
Then  title is "Gmail" for homepage
And  close site

Scenario:get the page source code
Given launch gmail site
Then  title is "Gmail" for homepage

Then get the sourcecode
And  close site

@ashok
Scenario Outline: multiple entries
Given launch gmail site
Then enter "<userid>" as uid
Then enter "<password>" as psd
And  close site
Examples:
| userid  |  password |
|bhai0raju |raju3333|
|sareddy789 |ashok11472 |