---
marp: true
---

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

#### Observability(관측가능성, 관찰가능성)
* 시스템의 속성을 자세히 설명하는데 사용하는 용어  
* System을 통해 시스템과 애플리케이션에서 발생하는 문제를 파악  
* 원격측정(Telemetry) Data : Logs, Metrics, Traces 

## Distributed Trace

시스템의 프로세스에서 특정 부분의 지연(latency)을 알려주는 원격 측정(telemetry)방법

마이크로 서비스 환경에서 지연 병목을 찾아내는 도구






## OpenCensus + OpenTracing = OpenTelemetry

![](img/otel.png) 

이전 발표 : [OpenCensus with Prometheus and Kubernetes](https://www.slideshare.net/JinwoongKim8/opencensus-with-prometheus-and-kubernetes) 

* OpenCensus : 애플리케이션 메트릭과 분산 트레이스(traces)를 수집하기 위한 다양한 언어별 라이브러리 세트

* OpenTracing : 분산 추적(tracing)을 위한 벤더 중립적인 API와 계측(instrumentation)

## What is OpenTelemetry?

#### [OpenTelemetry](https://opentelemetry.io/) 

Observability에 필요한 telemetry 데이터(Logs, Metrics, Traces)를 계측(instrumentation)하고 내보내기(export)하는 SDK, Specification.

* Open Standard, 커뮤니티 주도 프로젝트 by **CNCF**
* 라이브러리를 사용해서 벤더 중립적인 방식으로 여러 아키텍처의 애플리케이션 계측

## 