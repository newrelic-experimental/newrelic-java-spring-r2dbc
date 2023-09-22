<a href="https://opensource.newrelic.com/oss-category/#new-relic-experimental"><picture><source media="(prefers-color-scheme: dark)" srcset="https://github.com/newrelic/opensource-website/raw/main/src/images/categories/dark/Experimental.png"><source media="(prefers-color-scheme: light)" srcset="https://github.com/newrelic/opensource-website/raw/main/src/images/categories/Experimental.png"><img alt="New Relic Open Source experimental project banner." src="https://github.com/newrelic/opensource-website/raw/main/src/images/categories/Experimental.png"></picture></a>

![GitHub forks](https://img.shields.io/github/forks/newrelic-experimental/newrelic-java-spring-r2dbc?style=social)
![GitHub stars](https://img.shields.io/github/stars/newrelic-experimental/newrelic-java-spring-r2dbc?style=social)
![GitHub watchers](https://img.shields.io/github/watchers/newrelic-experimental/newrelic-java-spring-r2dbc?style=social)

![GitHub all releases](https://img.shields.io/github/downloads/newrelic-experimental/newrelic-java-spring-r2dbc/total)
![GitHub release (latest by date)](https://img.shields.io/github/v/release/newrelic-experimental/newrelic-java-spring-r2dbc)
![GitHub last commit](https://img.shields.io/github/last-commit/newrelic-experimental/newrelic-java-spring-r2dbc)
![GitHub Release Date](https://img.shields.io/github/release-date/newrelic-experimental/newrelic-java-spring-r2dbc)


![GitHub issues](https://img.shields.io/github/issues/newrelic-experimental/newrelic-java-spring-r2dbc)
![GitHub issues closed](https://img.shields.io/github/issues-closed/newrelic-experimental/newrelic-java-spring-r2dbc)
![GitHub pull requests](https://img.shields.io/github/issues-pr/newrelic-experimental/newrelic-java-spring-r2dbc)
![GitHub pull requests closed](https://img.shields.io/github/issues-pr-closed/newrelic-experimental/newrelic-java-spring-r2dbc)


# New Relic Java Instrumentation for Spring R2DBC

Instrumentation for the Spring R2DBC framework components

## Value

|Metrics | Events | Logs | Traces | Visualization | Automation |
|:-:|:-:|:-:|:-:|:-:|:-:|
|:white_check_mark:|:x:|:x:|:x:|:x:|:x:|


### List of Metrics,Events,Logs,Traces
|Module|Name | Type | Description |
|:-:|:-:|:-:|:-:|
|spring-data-r2dbc|Custom/R2dbcEntityTemplate/(Count,Delete,Exists,Insert,Select,Update) | Metric| Traces of org.springframework.data.r2dbc.core.R2dbcEntityTemplate methods|
|spring-data-r2dbc-4.x|Custom/R2dbcEntityTemplate/(Count,Delete,Exists,Insert,Select,Update) | Metric| Traces of org.springframework.data.r2dbc.core.R2dbcEntityTemplate methods|
|spring-r2dbc|Java/*class name*/rowsUpdated| Metric| Traces of implementers of org.springframework.r2dbc.core.UpdatedRowsFetchSpec|
|spring-r2dbc|Java/*class name*/(all,first,one)| Metric| Traces of implementers of org.springframework.r2dbc.core.RowsFetchSpec|
|spring-r2dbc|Java/org.springframework.r2dbc.connection.R2dbcTransactionManager/(doBegin,doCommit,doResume,doRollback,doSuspend)| Metric| Traces of org.springframework.r2dbc.connection.R2dbcTransactionManager|


## Installation

To install:

1. Download the latest release jar files.   
2. In the New Relic Java directory (the one containing newrelic.jar), create a directory named extensions if it does not already exist.
3. Copy the downloaded jars into the extensions directory.
4. Restart the application.

## Getting Started

Once installed, the instrumentation will track transactions through the various Spring R2DBC components.

## Building

Building the extension requires that Gradle is installed.
To build the extension jars from source, follow these steps:
### Build single extension
To build a single extension with name *extension*, do the following:
1. Set an environment variable *NEW_RELIC_EXTENSIONS_DIR* and set its value to the directory where you want the jar file built.
2. Run the command: ./gradlew *extension*:clean *extension*:install
### Build all extensions
To build all extensions, do the following:
1. Set an environment variable *NEW_RELIC_EXTENSIONS_DIR* and set its value to the directory where you want the jar file built.
2. Run the command: ./gradlew clean install

## Support

New Relic has open-sourced this project. This project is provided AS-IS WITHOUT WARRANTY OR DEDICATED SUPPORT. Issues and contributions should be reported to the project here on GitHub.

>We encourage you to bring your experiences and questions to the [Explorers Hub](https://discuss.newrelic.com) where our community members collaborate on solutions and new ideas.

## Contributing

We encourage your contributions to improve [Project Name]! Keep in mind when you submit your pull request, you'll need to sign the CLA via the click-through using CLA-Assistant. You only have to sign the CLA one time per project. If you have any questions, or to execute our corporate CLA, required if your contribution is on behalf of a company, please drop us an email at opensource@newrelic.com.

**A note about vulnerabilities**

As noted in our [security policy](../../security/policy), New Relic is committed to the privacy and security of our customers and their data. We believe that providing coordinated disclosure by security researchers and engaging with the security community are important means to achieve our security goals.

If you believe you have found a security vulnerability in this project or any of New Relic's products or websites, we welcome and greatly appreciate you reporting it to New Relic through [HackerOne](https://hackerone.com/newrelic).

## License

[Project Name] is licensed under the [Apache 2.0](http://apache.org/licenses/LICENSE-2.0.txt) License.
