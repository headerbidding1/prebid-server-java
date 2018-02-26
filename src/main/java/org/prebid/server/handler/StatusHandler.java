package org.prebid.server.handler;

import io.vertx.core.Handler;
import io.vertx.ext.web.RoutingContext;

public class StatusHandler implements Handler<RoutingContext> {

    @Override
    public void handle(RoutingContext context) {
        // just respond with HTTP 200 OK
        context.response().end();
    }
}