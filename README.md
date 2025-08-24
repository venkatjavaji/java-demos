# multi-java (Java 17 + JUnit monorepo)

This repo contains multiple independent Java projects under `projects/`. Each is a Java 17 + JUnit 5 project.
You can clone the repo and **sparse-checkout** just one project to work with minimal files locally.

## Layout
```
multi-java/
├── README.md
├── projects/
│   ├── calculator/           # Java 17 + JUnit 5 (10 tests)
│   └── string-utils/         # Java 17 + JUnit 5 (10 tests)
└── pom.xml                   # optional aggregator (parent) POM
```

## Build all projects
```bash
mvn -q clean test
```

## Build only one project (from repo root)
```bash
# calculator
mvn -q -pl projects/calculator test

# string-utils
mvn -q -pl projects/string-utils test
```

## Sparse checkout: work on a single folder
Clone only metadata, then checkout a single folder:
```bash
git clone --filter=blob:none --sparse https://github.com/<YOUR_USER>/multi-java.git
cd multi-java

# choose one project folder to work with
git sparse-checkout set projects/calculator

# work as usual
cd projects/calculator
mvn -q test
git add .
git commit -m "feat: update calculator"
git push origin main
```

Switch to another project later:
```bash
git sparse-checkout set projects/string-utils
```

Keep both:
```bash
git sparse-checkout add projects/string-utils
```

## Push this repo to GitHub
```bash
# inside the unzipped folder
git init
git add .
git commit -m "chore: init multi-java repo"
git branch -M main
git remote add origin https://github.com/<YOUR_USER>/multi-java.git
git push -u origin main
```
