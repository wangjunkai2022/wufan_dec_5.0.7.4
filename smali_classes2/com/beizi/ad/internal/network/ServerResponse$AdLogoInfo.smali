.class public Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;
.super Ljava/lang/Object;
.source "ServerResponse.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/ad/internal/network/ServerResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AdLogoInfo"
.end annotation


# static fields
.field public static TYPE_PIC:I = 0x0

.field public static TYPE_TEXT:I = 0x1


# instance fields
.field adurl:Ljava/lang/String;

.field type:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->type:I

    return-void
.end method

.method static synthetic access$100(Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->setAdurl(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$200(Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->setType(I)V

    return-void
.end method

.method private setAdurl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->adurl:Ljava/lang/String;

    return-void
.end method

.method private setType(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->type:I

    return-void
.end method


# virtual methods
.method public getAdurl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->adurl:Ljava/lang/String;

    return-object v0
.end method

.method public getType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;->type:I

    return v0
.end method
