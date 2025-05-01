.class public Lcom/efs/sdk/base/integrationtesting/IntegrationTestingUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static sIsInPeriod:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static isIntegrationTestingInPeriod()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/efs/sdk/base/integrationtesting/IntegrationTestingUtil;->sIsInPeriod:Z

    return v0
.end method

.method public static setIntegrationTestingInPeriod(Z)V
    .locals 0

    .line 1
    sput-boolean p0, Lcom/efs/sdk/base/integrationtesting/IntegrationTestingUtil;->sIsInPeriod:Z

    return-void
.end method
