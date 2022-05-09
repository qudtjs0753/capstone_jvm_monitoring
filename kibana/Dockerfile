ARG ELASTIC_SEARCH_KIBANA_VERSION

# https://www.docker.elastic.co/
FROM docker.elastic.co/kibana/kibana:${ELASTIC_SEARCH_KIBANA_VERSION}

# Add your kibana plugins setup here
RUN kibana-plugin install https://d3g5vo6xdbdb9a.cloudfront.net/downloads/kibana-plugins/opendistro-alerting/opendistroAlertingKibana-1.13.0.0.zip
# Example: RUN kibana-plugin install <name|url>
