#!/bin/bash

# 获取当前版本号
current_tag=(git describe --abbrev=0 --tags)

# 解析版本号的主版本、次版本和修订版本
major=(echo current_tag | awk -F '.' '{print1}')
minor=(echo current_tag | awk -F '.' '{print2}')
patch=(echo current_tag | awk -F '.' '{print3}')

# 递增修订版本号
patch=((patch + 1))

# 构建新的版本号标签
new_tag="major.minor.patch"

# 创建新的标签并推送到远程仓库
git tag new_tag
git push originnew_tag

# 输出新的标签
echo "New tag: $new_tag"