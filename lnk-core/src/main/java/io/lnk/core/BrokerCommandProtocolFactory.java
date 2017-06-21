package io.lnk.core;

import io.lnk.api.InvokerCommand;
import io.lnk.api.broker.BrokerCommand;
import io.lnk.api.protocol.ProtocolFactory;

/**
 * @author 刘飞 E-mail:liufei_it@126.com
 *
 * @version 1.0.0
 * @since 2017年6月21日 上午11:45:28
 */
public interface BrokerCommandProtocolFactory {
    InvokerCommand encode(BrokerCommand command, CommandArgProtocolFactory commandArgProtocolFactory, ProtocolFactory protocolFactory) throws Throwable;
    BrokerCommand decode(InvokerCommand command, ProtocolFactory protocolFactory) throws Throwable;
}
