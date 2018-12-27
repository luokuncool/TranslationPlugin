package cn.yiiguxing.plugin.translate.action

import cn.yiiguxing.plugin.translate.message
import cn.yiiguxing.plugin.translate.util.SelectionMode

/**
 * 翻译动作，自动取单个词，忽略选择
 */
class ExclusiveTranslateAction : TranslateAction(false) {

    init {
        @Suppress("InvalidBundleOrProperty")
        templatePresentation.description = message("action.description.exclusive")
    }

    override val selectionMode: SelectionMode
        get() = SelectionMode.EXCLUSIVE

}
