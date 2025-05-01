.class public final enum Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;
.super Ljava/lang/Enum;
.source "WebDiskCfgSetupModelEnumBean.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;

.field public static final enum NON_VM:Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;

.field public static final enum VM:Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;


# instance fields
.field private final state:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;

    const-string v1, "VM"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v1}, Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;->VM:Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;

    .line 2
    new-instance v1, Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;

    const-string v3, "NON_VM"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v3}, Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;->NON_VM:Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    .line 3
    sput-object v3, Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;->$VALUES:[Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;

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
    iput-object p3, p0, Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;->state:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;
    .locals 1

    .line 1
    const-class v0, Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;

    return-object p0
.end method

.method public static values()[Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;
    .locals 1

    .line 1
    sget-object v0, Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;->$VALUES:[Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;

    invoke-virtual {v0}, [Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;

    return-object v0
.end method
