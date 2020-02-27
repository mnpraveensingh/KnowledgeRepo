/*
 * package ftpKnowledge;
 * 
 * import java.io.File;
 * 
 * import org.springframework.batch.core.configuration.annotation.
 * EnableBatchProcessing; import
 * org.springframework.beans.factory.annotation.Value; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.ComponentScan; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.integration.annotation.InboundChannelAdapter; import
 * org.springframework.integration.annotation.IntegrationComponentScan; import
 * org.springframework.integration.annotation.Poller; import
 * org.springframework.integration.annotation.ServiceActivator; import
 * org.springframework.integration.channel.DirectChannel; import
 * org.springframework.integration.core.MessageSource; import
 * org.springframework.integration.file.FileReadingMessageSource; import
 * org.springframework.integration.file.FileWritingMessageHandler; import
 * org.springframework.integration.file.filters.AcceptOnceFileListFilter; import
 * org.springframework.integration.file.filters.SimplePatternFileListFilter;
 * import org.springframework.integration.file.support.FileExistsMode; import
 * org.springframework.integration.ftp.filters.FtpSimplePatternFileListFilter;
 * import
 * org.springframework.integration.ftp.inbound.FtpInboundFileSynchronizer;
 * import org.springframework.integration.ftp.inbound.
 * FtpInboundFileSynchronizingMessageSource; import
 * org.springframework.integration.ftp.session.DefaultFtpSessionFactory; import
 * org.springframework.messaging.Message; import
 * org.springframework.messaging.MessageChannel; import
 * org.springframework.messaging.MessageHandler; import
 * org.springframework.messaging.MessagingException; import
 * org.springframework.scheduling.annotation.EnableAsync; import
 * org.springframework.scheduling.annotation.EnableScheduling;
 * 
 * @Configuration
 * 
 * @EnableScheduling
 * 
 * @EnableBatchProcessing
 * 
 * @IntegrationComponentScan
 * 
 * @ComponentScan({ "com.mindtree" })
 * 
 * @EnableAsync public class LwbBatchConfiguration {
 * 
 * @Value("${ftp.integration.host}") private String ftpHost;
 * 
 * @Value("${ftp.integration.port}") private int ftpPort;
 * 
 * @Value("${ftp.integration.username}") private String ftpUsername;
 * 
 * @Value("${ftp.integration.password}") private String ftpPassword;
 * 
 * @Value("${ftp.integration.filefilter}") private String ftpFileFilter;
 * 
 * @Value("${ftp.integration.ftp-input-location}") private String
 * ftpInputLocation;
 * 
 * @Value("${ftp.integration.ftp-processed-location}") private String
 * ftpProcessedLocation;
 * 
 * @Value("${ftp.integration.ftp-remote-location}") private String
 * ftpRemoteLocation;
 * 
 * @Bean(name = "ftpChannel") public MessageChannel ftpOutputChannel() { return
 * new DirectChannel(); }
 * 
 * @Bean public DefaultFtpSessionFactory ftpSessionFactory() {
 * DefaultFtpSessionFactory sf = new DefaultFtpSessionFactory();
 * sf.setHost(ftpHost); sf.setPort(ftpPort); sf.setUsername(ftpUsername);
 * sf.setPassword(ftpPassword); return sf; }
 * 
 * @Bean public FtpInboundFileSynchronizer ftpInboundFileSynchronizer() {
 * FtpInboundFileSynchronizer fileSynchronizer = new
 * FtpInboundFileSynchronizer(ftpSessionFactory());
 * fileSynchronizer.setDeleteRemoteFiles(false);
 * fileSynchronizer.setRemoteDirectory(ftpRemoteLocation);
 * fileSynchronizer.setFilter(new
 * FtpSimplePatternFileListFilter(ftpFileFilter)); return fileSynchronizer; }
 * 
 * @Bean
 * 
 * @InboundChannelAdapter(value = "ftpChannel", poller = @Poller(fixedDelay =
 * "10000")) public MessageSource<File> ftpMessageSource() {
 * FtpInboundFileSynchronizingMessageSource source = new
 * FtpInboundFileSynchronizingMessageSource( ftpInboundFileSynchronizer());
 * source.setLocalDirectory(new File(ftpInputLocation));
 * source.setAutoCreateLocalDirectory(true); source.setLocalFilter(new
 * AcceptOnceFileListFilter<File>()); return source; }
 * 
 * @Bean
 * 
 * @ServiceActivator(inputChannel = "ftpChannel") public MessageHandler
 * handler() { return new MessageHandler() {
 * 
 * @Override public void handleMessage(Message<?> message) throws
 * MessagingException { System.out.println(message.getPayload()); }
 * 
 * }; }
 * 
 * @Bean(name = "fileChannel") public MessageChannel fileChannel() { return new
 * DirectChannel(); }
 * 
 * @Bean
 * 
 * @InboundChannelAdapter(value = "fileChannel", poller = @Poller(fixedDelay =
 * "5000")) public MessageSource<File> ftpFileReadingMessageSource() {
 * FileReadingMessageSource source = new FileReadingMessageSource();
 * source.setDirectory(new File(ftpInputLocation)); source.setFilter(new
 * SimplePatternFileListFilter(ftpFileFilter)); return source; }
 * 
 * @Bean
 * 
 * @ServiceActivator(inputChannel = "fileChannel") public MessageHandler
 * fileWritingMessageHandler() { FileWritingMessageHandler handler = new
 * FileWritingMessageHandler(new File(ftpProcessedLocation));
 * handler.setFileExistsMode(FileExistsMode.REPLACE);
 * handler.setExpectReply(false); return handler; }
 * 
 * }
 */