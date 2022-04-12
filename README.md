# jpa01-jacksonude

Starter code at https://ucsb-cs156.github.io/w22/lab/jpa01/

# Testing with Junit

To run test cases with JUnit, use:

```
mvn test
```

# Code Coverage

To calculate code coverage with Jacoco, use:

```
mvn test jacoco:report
```

Then open: `target/site/jacoco/index.html` in a web browser.

https://app.codecov.io/gh/ucsb-cs156-s22/jpa01-jacksonjude

# Mutation testing

To run mutation testing with pitest, use:

```
mvn test org.pitest:pitest-maven:mutationCoverage
```

Then open `target/pit-reports/DATE-TIME-STAMP/index.html`

Note that the `DATE-TIME-STAMP` will vary; it will be something like `202112311716`
