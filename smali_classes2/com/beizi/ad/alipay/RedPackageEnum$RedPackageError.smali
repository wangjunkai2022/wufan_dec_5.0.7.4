.class public final enum Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;
.super Ljava/lang/Enum;
.source "RedPackageEnum.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/ad/alipay/RedPackageEnum;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "RedPackageError"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

.field public static final enum ERROR_ALIPAY_SDK_NOT_EXIST:Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

.field public static final enum ERROR_AUTH_INFO_FAIL:Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

.field public static final enum ERROR_AUTH_USER_INFO_NOT_EXIST:Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

.field public static final enum ERROR_CONFIG_URL_EXCEPTION:Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

.field public static final enum ERROR_EXCEPTION_SHOW:Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

.field public static final enum ERROR_GET_USER_INFO_FAIL:Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

.field public static final enum ERROR_PARSE_EXCEPTION:Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

.field public static final enum ERROR_REQUEST_EXCEPTION:Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

.field public static final enum ERROR_REQUEST_PARAM_ERROR:Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

.field public static final enum ERROR_UNKNOWN_EXCEPTION:Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;


# instance fields
.field private code:I

.field private msg:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

    const-string v1, "ERROR_REQUEST_PARAM_ERROR"

    const/4 v2, 0x0

    const/16 v3, 0x271b

    const-string v4, "request param error"

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->ERROR_REQUEST_PARAM_ERROR:Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

    .line 2
    new-instance v1, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

    const-string v3, "ERROR_REQUEST_EXCEPTION"

    const/4 v4, 0x1

    const/16 v5, 0x271c

    const-string v6, "request exception"

    invoke-direct {v1, v3, v4, v5, v6}, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v1, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->ERROR_REQUEST_EXCEPTION:Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

    .line 3
    new-instance v3, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

    const-string v5, "ERROR_PARSE_EXCEPTION"

    const/4 v6, 0x2

    const/16 v7, 0x271d

    const-string v8, "parse exception"

    invoke-direct {v3, v5, v6, v7, v8}, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v3, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->ERROR_PARSE_EXCEPTION:Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

    .line 4
    new-instance v5, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

    const-string v7, "ERROR_CONFIG_URL_EXCEPTION"

    const/4 v8, 0x3

    const/16 v9, 0x271e

    const-string v10, "config url not exist"

    invoke-direct {v5, v7, v8, v9, v10}, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v5, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->ERROR_CONFIG_URL_EXCEPTION:Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

    .line 5
    new-instance v7, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

    const-string v9, "ERROR_AUTH_USER_INFO_NOT_EXIST"

    const/4 v10, 0x4

    const/16 v11, 0x271f

    const-string v12, "auth user info not exist"

    invoke-direct {v7, v9, v10, v11, v12}, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v7, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->ERROR_AUTH_USER_INFO_NOT_EXIST:Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

    .line 6
    new-instance v9, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

    const-string v11, "ERROR_GET_USER_INFO_FAIL"

    const/4 v12, 0x5

    const/16 v13, 0x2720

    const-string v14, "get user info fail"

    invoke-direct {v9, v11, v12, v13, v14}, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v9, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->ERROR_GET_USER_INFO_FAIL:Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

    .line 7
    new-instance v11, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

    const-string v13, "ERROR_AUTH_INFO_FAIL"

    const/4 v14, 0x6

    const/16 v15, 0x2721

    const-string v12, "auth info fail"

    invoke-direct {v11, v13, v14, v15, v12}, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v11, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->ERROR_AUTH_INFO_FAIL:Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

    .line 8
    new-instance v12, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

    const-string v13, "ERROR_ALIPAY_SDK_NOT_EXIST"

    const/4 v15, 0x7

    const/16 v14, 0x2722

    const-string v10, "alipay sdk not exist"

    invoke-direct {v12, v13, v15, v14, v10}, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v12, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->ERROR_ALIPAY_SDK_NOT_EXIST:Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

    .line 9
    new-instance v10, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

    const-string v13, "ERROR_EXCEPTION_SHOW"

    const/16 v14, 0x8

    const/16 v15, 0x2723

    const-string v8, "exception error"

    invoke-direct {v10, v13, v14, v15, v8}, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v10, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->ERROR_EXCEPTION_SHOW:Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

    .line 10
    new-instance v8, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

    const-string v13, "ERROR_UNKNOWN_EXCEPTION"

    const/16 v15, 0x9

    const/16 v14, 0x2773

    const-string v6, "unknown exception"

    invoke-direct {v8, v13, v15, v14, v6}, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v8, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->ERROR_UNKNOWN_EXCEPTION:Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

    const/16 v6, 0xa

    new-array v6, v6, [Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

    aput-object v0, v6, v2

    aput-object v1, v6, v4

    const/4 v0, 0x2

    aput-object v3, v6, v0

    const/4 v0, 0x3

    aput-object v5, v6, v0

    const/4 v0, 0x4

    aput-object v7, v6, v0

    const/4 v0, 0x5

    aput-object v9, v6, v0

    const/4 v0, 0x6

    aput-object v11, v6, v0

    const/4 v0, 0x7

    aput-object v12, v6, v0

    const/16 v0, 0x8

    aput-object v10, v6, v0

    aput-object v8, v6, v15

    .line 11
    sput-object v6, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->$VALUES:[Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput p3, p0, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->code:I

    .line 3
    iput-object p4, p0, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->msg:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;
    .locals 1

    .line 1
    const-class v0, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

    return-object p0
.end method

.method public static values()[Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;
    .locals 1

    .line 1
    sget-object v0, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->$VALUES:[Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

    invoke-virtual {v0}, [Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

    return-object v0
.end method


# virtual methods
.method public getCode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->code:I

    return v0
.end method

.method public getMsg()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->msg:Ljava/lang/String;

    return-object v0
.end method
