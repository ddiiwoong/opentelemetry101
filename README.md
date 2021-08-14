<!--
theme: gaia
headingDivider: 2 
paginate: true
-->

<!--
_class:
 - lead
 - invert
-->

# Getting Started with OpenTelemetry 

NexCloud 김진웅

## What is Observability?

Observability(관측가능성, 관찰가능성)은 시스템의 속성을 자세히 설명하는데 사용하는 용어  
Observability System을 통해 시스템과 애플리케이션에서 발생하는 문제를 파악  
Observability 기본 구성요소 : Logs, Metrics, Traces 

## What is OpenTelemetry?

![](img/otel.png) 

[OpenCensus with Prometheus and Kubernetes](https://www.slideshare.net/JinwoongKim8/opencensus-with-prometheus-and-kubernetes) 


Observability에 필요한 telemetry 데이터인 Logs, Metrics, Traces 를 계측(instrumentation)하고 내보내기(export)를 담당하는 specification이자 SDK set.

제공되는 라이브러리를 사용해서 공급업체 중립적인 방식으로 여러 아키텍처에 대한 애플리케이션을 계측

### [OpenTelemetry](https://opentelemetry.io/) 


[Marp Action](https://github.com/ralexander-phi/marp-action) lets you automatically deploy your presentation to [GitHub Pages](https://pages.github.com/).

This presentation is both a [website](https://alexsci.com/test-marp-action) and a [README.md](https://github.com/ralexander-phi/test-marp-action/blob/dev/README.md).

## Why?

Treat your presentation the same way you treat code.

Use git to track changes. Pull requests to collaborate. Deploy to a webpage automatically.

See a bug? Open an issue or pull request!

## Setup

Want to create your own?

First, create a new repo [from the template repo](https://github.com/ralexander-phi/test-marp-action).

![](img/use-template.png)

## Configure GitHub Pages

[Setup publishing](https://help.github.com/en/github/working-with-github-pages/configuring-a-publishing-source-for-your-github-pages-site#choosing-a-publishing-source).

Remember the branch and URL shown.

## Update Workflow

You'll update the workflow file over the next few slides. You can do this right in the GitHub web page (click on the pencil icon).

`.github/workflows/main.yml`

## `BASE_URL`

Set this to the domain you're using for GitHub Page (from earlier).

If you add a custom domain later, you'll need to update this.

## `PUBLISH_TO_BRANCH`

Tell the build which branch you are using for GitHub Pages (you picked this earlier).

This is likely either `main` or `gh-pages`. Set `PUBLISH_TO_BRANCH` to the correct branch.

## Update Workflow

Commit `.github/workflows/main.yml` back to `dev` branch.

This will kick off a build.

## Check if the build succeeded

Click on Actions tab and see if the build succeeded.

![](img/click-actions.png)

## Load your new web page

Any update to your site will take a few minutes to be visible. Be patient.

## Create your slides

Finally, start adding your own content.

You can [install and run marp-cli](https://github.com/marp-team/marp-cli/blob/master/README.md) locally to test out the content before publishing.

## Learn more about Marp

This is a good time to learn more about Marp. Here's some resources:

- [CommonMark](https://commonmark.org/)
- [Cheat Sheet](https://commonmark.org/help/)
- [Themes](https://github.com/marp-team/marp-core/tree/master/themes)
- [CSS Themes](https://marpit.marp.app/theme-css)
- [Directives](https://marpit.marp.app/directives)
- [VS Code plugin](https://marketplace.visualstudio.com/items?itemName=marp-team.marp-vscode)

## Example Sites

Known sites using this action are:

- [University of Illinois at Urbana-Champaign's CS 199 Even More Practice](https://cs199emp.netlify.app/) [(code)](https://github.com/harsh183/emp-125)

Send a [pull request](https://github.com/ralexander-phi/test-marp-action) to get your site added.

## Publish your slides

When you are ready to share your presentation, commit or merge to `dev` and your content on GitHub Pages will automatically update.

# 🎉
<!--
_class:
 - lead
 - invert
-->
### Hooray!

