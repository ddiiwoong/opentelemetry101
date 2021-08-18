---
marp: true
---

<!--
theme: gaia
style: |
    /*
    * @theme enable-all-auto-scaling
    * @auto-scaling true
    */
    /* @theme marpit-theme */
    section {
      font-size: 30px;
      padding: 50px;
    }
    section.lead h2 {
      font-size: 30px;
      text-align: center;
    }
size: 4K
headingDivider: 2 
paginate: false
-->

<!--
_class:
 - lead
 - invert
-->

# Getting Started with OpenTelemetry 

NexCloud 김진웅

## What is Observability?

#### Observability(관측가능성, 관찰가능성)
* 시스템의 속성을 자세히 설명하는데 사용하는 용어  
* System을 통해 시스템과 애플리케이션에서 발생하는 문제를 파악  
* 원격측정(Telemetry) Data : Logs, Metrics, Traces 

## Distributed Trace

시스템의 프로세스에서 특정 부분의 지연(latency)을 알려주는 원격 측정(telemetry)방법

마이크로 서비스 환경에서 지연 병목을 찾아내는 도구

## OpenCensus + OpenTracing = OpenTelemetry

![width:500px](img/otel.png) 

이전 발표 : [OpenCensus with Prometheus and Kubernetes](https://www.slideshare.net/JinwoongKim8/opencensus-with-prometheus-and-kubernetes) 

* OpenCensus : 애플리케이션 메트릭과 분산 트레이스(traces)를 수집하기 위한 다양한 언어별 라이브러리 셋

* OpenTracing : 분산 추적(tracing)을 위한 벤더 중립적인 API와 계측(instrumentation)

## What is OpenTelemetry?

#### [OpenTelemetry](https://opentelemetry.io/) 

Observability에 필요한 telemetry 데이터(Logs, Metrics, Traces)를 계측(instrumentation)하고 내보내기(export)하는 SDK, Specification 등의 도구(Toos)

- Kubernetes 이후 가장 활발한 CNCF 프로젝트
- Open Standard, 커뮤니티 주도 Sandbox 프로젝트 by **CNCF**
- 라이브러리를 사용해서 벤더 중립적인(Agnostic) 방식으로 다양한 아키텍처의 애플리케이션 계측

## Ecosystem

- Support Language - Go, Ruby, C++, Rus, PHP, JavaScript, Java, etc...
- Ecosystem - Jaeger, Fluentbit, Prometheus, Kubernetes
- Communities
  - CSP: Azure, GCP, AWS
  - Vendors: Datadog, Dynatrace, honeycomb, Lightstep, New Relic, Splunk, Stackdriver
  - Users: Mailchimp, Shopify

## Why OpenTelemetry?

#### Simple Microservices

![width:600px](img/simple.png) 

## Why OpenTelemetry?

#### Modern(Real) Architecture

![width:600px](img/microservices.png) 

## Context Propagation

#### 서비스간 트레이스 전달 규약

![width:700px](img/propagation.png) 

## Trace, Span

서비스 요청에 대한 애플리케이션 또는 서비스 구조 확인
모든 서비스들 간 데이터 흐름을 시각화하여 아키텍처상의 병목 현상을 파악 

**Trace** in OpenTelemetry are defined implicitly by their Spans
**Span** represents an operation within a transaction.

![width:750px](img/spans-traces.png)

## Trace Context Propagation
[W3C standard for Context Propagation](https://www.w3.org/TR/trace-context/)

### version-format   = trace-id "-" parent-id "-" trace-flags
trace-id         = 32HEXDIGLC  ; 16 bytes array identifier. All zeroes forbidden
parent-id        = 16HEXDIGLC  ; 8 bytes array identifier. All zeroes forbidden
trace-flags      = 2HEXDIGLC   ; 8 bit flags. Currently, only one bit is used.

Compatible with all **OpenCensus** Client Libraries.

## Glossary
- **Signal** : categories of telemetry (Metrics, logs, traces, and baggage)
- **Context** : context 제공 (W3C trace-context, B3, AWS X-Ray, etc)
- **Context Propagation** : 서비스간 Trace, Span, Flags 등 전달 규약
- **Cross-cutting concern** : 횡단 관심사 ()

https://github.com/open-telemetry/opentelemetry-specification/blob/main/specification/glossary.md


## Terms
- **Traces** : get context
- **Spans** : "call" in a trace (Kind, Attributes, Events, Links)
- **Sampler** : always, probabilistic, etc.
- **Span Processor** : simple, batch, etc.
- **Expoter** : OTLP(OpenTelemetry protocol), Jaeger, Prometheus, etc.

- API: Used to generate telemetry data. Defined per data source as well as for other aspects including baggage and propagators.
- SDK: Implementation of the API with processing and exporting capabilities. Defined per data source as well as for other aspects including resources and configuration.
- Data: Defines semantic conventions to provide vendor-agnostic implementations as well as the OpenTelemetry protocol (OTLP).

## Client Architecture

#### Client Types
![width:850px](img/agent_type.svg)

#### Client Data Pipeline
![width:800px](img/client.png)

## Collector Architecture

![width:700px](img/collector.png)

## Traces & Sampling


span과 메트릭에 key=value를 추가하게 되는데 이는 데이터를 수집하는데 있어서 비용 문제를 발생시킴

그래서 샘플링이 필요하고 Sampling은 데이터를 수집, 분석하는 비용을 낮춰준다. 

하지만 biased sample, too-small sample 등 문제가 발생할 여지가 있기 때문에 이런 문제를 해결하기 위해서는 sampling rate 개념을 적용해서 특정 비율을 데이터를 수집하여 처리를 한다.

예전에 opencensus에는 Always, Never, Probabilistic, RateLimiting 이렇게 있었는데 
opentelemetry에는 확인이 필요함

## Traces & Sampling

화면과 정의


## Why you need OpenTelemetry and what it can do

- A single, vendor-agnostic instrumentation library per language with support for both automatic and manual instrumentation.
- A single collector binary that can be deployed in a variety of ways including as an agent or gateway.
- Send data to multiple destinations in parallel through configuration.
- Open-standard semantic conventions to ensure vendor-agnostic data collection
- The ability to support multiple context propagation formats in parallel to assist with migrating as standards evolve.
- With support for a variety of open-source and commercial protocols
- Easy to adopt OpenTelemetry.(If you have experienced OpenTracing and OpenCensus projects)


## What OpenTelemetry is not 

- OpenTelemetry is not an observability back-end like Jaeger or Prometheus. 
- Instead, it supports exporting data to a variety of open-source and commercial back-ends. 
- It provides a pluggable architecture so additional technology protocols and formats can be easily added.



## Specification

- API: Used to generate telemetry data. Defined per data source as well as for other aspects including baggage and propagators.
- SDK: Implementation of the API with processing and exporting capabilities. Defined per data source as well as for other aspects including resources and configuration.
- Data: Defines semantic conventions to provide vendor-agnostic implementations as well as the OpenTelemetry protocol (OTLP).
