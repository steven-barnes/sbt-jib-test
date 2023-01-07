
export AWS_REGION="us-east-1"
export VERSION="1.0.1"
export JIB_TARGET_IMAGE_USERNAME="AWS"
export JIB_TARGET_IMAGE_PASSWORD=$(aws ecr get-login-password --region ${AWS_REGION})
sbt -v -d "set ThisBuild / version := \"${VERSION}\"" "set jibTags := List(\"develop\")" "project server" clean jibImageBuild
