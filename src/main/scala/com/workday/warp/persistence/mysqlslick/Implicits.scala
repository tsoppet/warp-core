package com.workday.warp.persistence.mysqlslick

import scala.language.{higherKinds, implicitConversions}
import slick.ast.BaseTypedType
import slick.lifted.{Query, Rep, SimpleExpression}

/**
  * Created by ruiqi.wang 
  */
trait Implicits extends ColumnImplicits {

}

trait ColumnImplicits {

  implicit def customSingleColumnQueryExtensionMethods[B1: BaseTypedType, C[_]](q: Query[Rep[B1], _, C]): SlickExtensionMethods[B1, B1, C] = new SlickExtensionMethods[B1, B1, C](q)

  implicit def customSingleOptionColumnQueryExtensionMethods[B1: BaseTypedType, C[_]](q: Query[Rep[Option[B1]], _, C]): SlickExtensionMethods[B1, Option[B1], C] = new SlickExtensionMethods[B1, Option[B1], C](q)


}

