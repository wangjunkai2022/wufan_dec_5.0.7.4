.class public final enum Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;
.super Ljava/lang/Enum;
.source "WebDiskCfgDownLoadStateBean.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;

.field public static final enum COMPLEX:Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;

.field public static final enum PRIVATE_DOMAIN:Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;

.field public static final enum SIMPLE:Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;

.field public static final enum WEB_DISK:Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;


# instance fields
.field private final state:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;

    const-string v1, "COMPLEX"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v1}, Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;->COMPLEX:Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;

    .line 2
    new-instance v1, Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;

    const-string v3, "SIMPLE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v3}, Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;->SIMPLE:Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;

    .line 3
    new-instance v3, Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;

    const-string v5, "WEB_DISK"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v5}, Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;->WEB_DISK:Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;

    .line 4
    new-instance v5, Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;

    const-string v7, "PRIVATE_DOMAIN"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v7}, Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;->PRIVATE_DOMAIN:Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;

    const/4 v7, 0x4

    new-array v7, v7, [Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    .line 5
    sput-object v7, Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;->$VALUES:[Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-object p3, p0, Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;->state:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;
    .locals 1

    .line 1
    const-class v0, Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;

    return-object p0
.end method

.method public static values()[Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;
    .locals 1

    .line 1
    sget-object v0, Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;->$VALUES:[Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;

    invoke-virtual {v0}, [Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;

    return-object v0
.end method
