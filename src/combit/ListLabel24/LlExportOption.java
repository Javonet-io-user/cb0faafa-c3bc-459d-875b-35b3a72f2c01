package combit.ListLabel24;

public enum LlExportOption {
  ExportAllInOneFile(0L),
  ExportFile(1L),
  ExportPath(2L),
  ExportTarget(3L),
  ExportQuiet(4L),
  ExportShowResult(5L),
  ExportShowResultAvailable(6L),
  ExportSendAsMail(7L),
  ExportSendAsMailAvailable(8L),
  ExportMailBody(9L),
  ExportMailAttachmentList(10L),
  ExportMailSecureConnection(11L),
  ExportMailSmtpServerTimeOut(12L),
  ExportMailSmtpServerAddress(13L),
  ExportMailSmtpServerPort(14L),
  ExportMailSmtpUser(15L),
  ExportMailSmtpPassword(16L),
  ExportMailSmtpProxyType(17L),
  ExportMailSmtpProxyAddress(18L),
  ExportMailSmtpProxyPort(19L),
  ExportMailSmtpProxyUser(20L),
  ExportMailSmtpProxyPassword(21L),
  ExportMailSmtpSenderAddress(22L),
  ExportMailSmtpSenderName(23L),
  ExportMailSmtpReplyTo(24L),
  ExportMailSmtpFrom(25L),
  ExportMailSmtpPopBeforeSmtp(26L),
  ExportMailSmtpServerUser(27L),
  ExportMailSmtpServerPassword(28L),
  ExportMailTo(29L),
  ExportMailCc(30L),
  ExportMailBcc(31L),
  ExportMailProvider(32L),
  ExportMailSubject(33L),
  ExportMailShowDialog(34L),
  ExportMailSendResultAs(35L),
  ExportSaveAsZip(36L),
  ExportSaveAsZipAvailable(37L),
  ExportZipFile(38L),
  ExportZipPath(39L),
  ExportOnlyTableData(40L),
  ExportSignResult(41L),
  ExportSignResultAvailable(42L),
  ExportSignatureProvider(43L),
  ExportSignatureProviderOption(44L),
  ExportSignatureFormat(45L),
  PictureFormat(46L),
  PictureJpegEncoding(47L),
  PictureJpegQuality(48L),
  PictureBitsPerPixel(49L),
  UsePosFrame(50L),
  VerbosityRectangle(51L),
  VerbosityBarcode(52L),
  VerbosityDrawing(53L),
  VerbosityEllipse(54L),
  VerbosityLine(55L),
  VerbosityText(56L),
  VerbosityTextFrames(57L),
  VerbosityRtf(58L),
  VerbosityRtfFrames(59L),
  VerbosityTable(60L),
  VerbosityTableCell(61L),
  VerbosityTableFrames(62L),
  VerbosityLLXObject(63L),
  VerbosityLLXObjectHtmlObject(64L),
  HtmlTitle(65L),
  HtmlFormHeader(66L),
  HtmlFormFooter(67L),
  LayouterPercentaged(68L),
  LayouterFixedPageHeight(69L),
  PdfTitle(70L),
  PdfSubject(71L),
  PdfKeywords(72L),
  PdfAuthor(73L),
  PdfEncryptionEncryptFile(74L),
  PdfEncryptionEnablePrinting(75L),
  PdfEncryptionEnableChanging(76L),
  PdfEncryptionEnableCopying(77L),
  PdfEncryptionLevel(78L),
  PdfOwnerPassword(79L),
  PdfUserPassword(80L),
  PdfFontMode(81L),
  PdfExcludedFonts(82L),
  PdfCompressStreamMethod(83L),
  PdfPdfAMode(84L),
  PdfDontStackWorldModifications(85L),
  PdfFileAttachments(86L),
  Resolution(87L),
  TxtFrameChar(88L),
  TxtSeparatorChar(89L),
  TxtIgnoreGroupLines(90L),
  TxtIgnoreHeaderFooterLines(91L),
  TxtCharset(92L),
  TtyEmulation(93L),
  TtyDestination(94L),
  TtyDefaultFilename(95L),
  TtyAdvanceAfterPrint(96L),
  TiffCompressionType(97L),
  TiffCompressionQuality(98L),
  XlsFontScalingPercentage(99L),
  XlsPrintingZoom(100L),
  XlsIgnoreGroupLines(101L),
  XlsIgnoreHeaderFooterLines(102L),
  XlsIgnoreLineWrapForDataOnlyExport(103L),
  XlsConvertNumeric(104L),
  XlsAllPagesOneSheet(105L),
  XlsWorksheetName(106L),
  XlsFileFormat(107L),
  XlsAutoFit(108L),
  XmlTitle(109L),
  XhtmlUseAdvancedCss(110L),
  XhtmlToolbarType(111L),
  XhtmlTitle(112L),
  XhtmlUseSeparateCss(113L),
  JqmTitle(114L),
  JqmCDN(115L),
  JqmListDataFilter(116L),
  JqmUseDividerLines(117L),
  JqmBaseTheme(118L),
  JqmHeaderTheme(119L),
  JqmDividerTheme(120L),
  JqmColumnMode(121L),
  DocxFontScalingPercentage(122L),
  DocxAllPagesOneFile(123L),
  DocxCellScalingPercentageHeight(124L),
  DocxCellScalingPercentageWidth(125L),
  DocxFloatingTableMode(126L),
  SvgTitle(127L),
  PdfZUGFeRDConformanceLevel(128L),
  PdfZUGFeRDXmlPath(129L),
  PptxFontScalingPercentage(130L),
  PptxAnimation(131L),
  ExportMailPop3SocketTimeout(132L),
  ExportMailPop3SenderDomain(133L),
  ExportMailPop3ServerPort(134L),
  ExportMailPop3ServerAddress(135L),
  ExportMailPop3ServerUser(136L),
  ExportMailPop3ServerPassword(137L),
  ExportMailPop3ProxyAddress(138L),
  ExportMailPop3ProxyPort(139L),
  ExportMailPop3ProxyUser(140L),
  ExportMailPop3ProxyPassword(141L),
  ExportMailXmapiServerUser(142L),
  ExportMailXmapiServerPassword(143L),
  ExportMailXmapiSuppressLogonFailure(144L),
  ExportMailXmapiDeleteAfterSend(145L),
  ;
  private long numVal;

  LlExportOption(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
