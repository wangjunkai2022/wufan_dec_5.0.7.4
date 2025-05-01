.class public final Lcom/kwai/adclient/kscommerciallogger/model/b;
.super Lcom/kwai/adclient/kscommerciallogger/model/d;
.source "SourceFile"


# static fields
.field public static final aVb:Lcom/kwai/adclient/kscommerciallogger/model/d;

.field public static final aVc:Lcom/kwai/adclient/kscommerciallogger/model/d;

.field public static final aVd:Lcom/kwai/adclient/kscommerciallogger/model/d;

.field public static final aVe:Lcom/kwai/adclient/kscommerciallogger/model/d;

.field public static final aVf:Lcom/kwai/adclient/kscommerciallogger/model/d;

.field public static final aVg:Lcom/kwai/adclient/kscommerciallogger/model/d;

.field public static final aVh:Lcom/kwai/adclient/kscommerciallogger/model/d;

.field public static final aVi:Lcom/kwai/adclient/kscommerciallogger/model/d;

.field public static final aVj:Lcom/kwai/adclient/kscommerciallogger/model/d;

.field public static final aVk:Lcom/kwai/adclient/kscommerciallogger/model/d;

.field public static final aVl:Lcom/kwai/adclient/kscommerciallogger/model/d;

.field public static final aVm:Lcom/kwai/adclient/kscommerciallogger/model/d;

.field public static final aVn:Lcom/kwai/adclient/kscommerciallogger/model/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/kwai/adclient/kscommerciallogger/model/d;

    const-string v1, "NETWORK_NO_BODY"

    invoke-direct {v0, v1}, Lcom/kwai/adclient/kscommerciallogger/model/d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/kwai/adclient/kscommerciallogger/model/b;->aVb:Lcom/kwai/adclient/kscommerciallogger/model/d;

    .line 2
    new-instance v0, Lcom/kwai/adclient/kscommerciallogger/model/d;

    const-string v1, "NETWORK_FORMAT_ERROR"

    invoke-direct {v0, v1}, Lcom/kwai/adclient/kscommerciallogger/model/d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/kwai/adclient/kscommerciallogger/model/b;->aVc:Lcom/kwai/adclient/kscommerciallogger/model/d;

    .line 3
    new-instance v0, Lcom/kwai/adclient/kscommerciallogger/model/d;

    const-string v1, "NETWORK_INFO_INCOMPLETE"

    invoke-direct {v0, v1}, Lcom/kwai/adclient/kscommerciallogger/model/d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/kwai/adclient/kscommerciallogger/model/b;->aVd:Lcom/kwai/adclient/kscommerciallogger/model/d;

    .line 4
    new-instance v0, Lcom/kwai/adclient/kscommerciallogger/model/d;

    const-string v1, "NETWORK_BUSINESS_ERROR"

    invoke-direct {v0, v1}, Lcom/kwai/adclient/kscommerciallogger/model/d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/kwai/adclient/kscommerciallogger/model/b;->aVe:Lcom/kwai/adclient/kscommerciallogger/model/d;

    .line 5
    new-instance v0, Lcom/kwai/adclient/kscommerciallogger/model/d;

    const-string v1, "NETWORK_ERROR"

    invoke-direct {v0, v1}, Lcom/kwai/adclient/kscommerciallogger/model/d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/kwai/adclient/kscommerciallogger/model/b;->aVf:Lcom/kwai/adclient/kscommerciallogger/model/d;

    .line 6
    new-instance v0, Lcom/kwai/adclient/kscommerciallogger/model/d;

    const-string v1, "METHOD_PARAM_ILLEGAL"

    invoke-direct {v0, v1}, Lcom/kwai/adclient/kscommerciallogger/model/d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/kwai/adclient/kscommerciallogger/model/b;->aVg:Lcom/kwai/adclient/kscommerciallogger/model/d;

    .line 7
    new-instance v0, Lcom/kwai/adclient/kscommerciallogger/model/d;

    const-string v1, "METHOD_LONG_TIME"

    invoke-direct {v0, v1}, Lcom/kwai/adclient/kscommerciallogger/model/d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/kwai/adclient/kscommerciallogger/model/b;->aVh:Lcom/kwai/adclient/kscommerciallogger/model/d;

    .line 8
    new-instance v0, Lcom/kwai/adclient/kscommerciallogger/model/d;

    const-string v1, "METHOD_ERROR"

    invoke-direct {v0, v1}, Lcom/kwai/adclient/kscommerciallogger/model/d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/kwai/adclient/kscommerciallogger/model/b;->aVi:Lcom/kwai/adclient/kscommerciallogger/model/d;

    .line 9
    new-instance v0, Lcom/kwai/adclient/kscommerciallogger/model/d;

    const-string v1, "PAGE_RENDER_FAIL"

    invoke-direct {v0, v1}, Lcom/kwai/adclient/kscommerciallogger/model/d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/kwai/adclient/kscommerciallogger/model/b;->aVj:Lcom/kwai/adclient/kscommerciallogger/model/d;

    .line 10
    new-instance v0, Lcom/kwai/adclient/kscommerciallogger/model/d;

    const-string v1, "VIEW_RENDER_FAIL"

    invoke-direct {v0, v1}, Lcom/kwai/adclient/kscommerciallogger/model/d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/kwai/adclient/kscommerciallogger/model/b;->aVk:Lcom/kwai/adclient/kscommerciallogger/model/d;

    .line 11
    new-instance v0, Lcom/kwai/adclient/kscommerciallogger/model/d;

    const-string v1, "RENDER_ERROR"

    invoke-direct {v0, v1}, Lcom/kwai/adclient/kscommerciallogger/model/d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/kwai/adclient/kscommerciallogger/model/b;->aVl:Lcom/kwai/adclient/kscommerciallogger/model/d;

    .line 12
    new-instance v0, Lcom/kwai/adclient/kscommerciallogger/model/d;

    const-string v1, "MATERIAL_LOAD_FAIL"

    invoke-direct {v0, v1}, Lcom/kwai/adclient/kscommerciallogger/model/d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/kwai/adclient/kscommerciallogger/model/b;->aVm:Lcom/kwai/adclient/kscommerciallogger/model/d;

    .line 13
    new-instance v0, Lcom/kwai/adclient/kscommerciallogger/model/d;

    const-string v1, "EXCEPTION"

    invoke-direct {v0, v1}, Lcom/kwai/adclient/kscommerciallogger/model/d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/kwai/adclient/kscommerciallogger/model/b;->aVn:Lcom/kwai/adclient/kscommerciallogger/model/d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kwai/adclient/kscommerciallogger/model/d;-><init>(Ljava/lang/String;)V

    return-void
.end method
