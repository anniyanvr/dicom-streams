package se.nimsa.dicom.data

private[data] object KeywordToTag {

  def tagOf(keyword: String): Int =
    try Tag.getClass.getMethod(keyword).invoke(Tag).asInstanceOf[Int] catch {
      case _: Throwable => throw new IllegalArgumentException(s"Unknown keyword $keyword")
    }
}