.class public final enum Lcom/beizi/ad/NativeAdResponse$b;
.super Ljava/lang/Enum;
.source "NativeAdResponse.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/ad/NativeAdResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/beizi/ad/NativeAdResponse$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/beizi/ad/NativeAdResponse$b;

.field public static final enum b:Lcom/beizi/ad/NativeAdResponse$b;

.field private static final synthetic c:[Lcom/beizi/ad/NativeAdResponse$b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/beizi/ad/NativeAdResponse$b;

    const-string v1, "CONTENT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/beizi/ad/NativeAdResponse$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/beizi/ad/NativeAdResponse$b;->a:Lcom/beizi/ad/NativeAdResponse$b;

    .line 2
    new-instance v1, Lcom/beizi/ad/NativeAdResponse$b;

    const-string v3, "APP_INSTALL"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/beizi/ad/NativeAdResponse$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/beizi/ad/NativeAdResponse$b;->b:Lcom/beizi/ad/NativeAdResponse$b;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/beizi/ad/NativeAdResponse$b;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    .line 3
    sput-object v3, Lcom/beizi/ad/NativeAdResponse$b;->c:[Lcom/beizi/ad/NativeAdResponse$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/beizi/ad/NativeAdResponse$b;
    .locals 1

    .line 1
    const-class v0, Lcom/beizi/ad/NativeAdResponse$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/beizi/ad/NativeAdResponse$b;

    return-object p0
.end method

.method public static values()[Lcom/beizi/ad/NativeAdResponse$b;
    .locals 1

    .line 1
    sget-object v0, Lcom/beizi/ad/NativeAdResponse$b;->c:[Lcom/beizi/ad/NativeAdResponse$b;

    invoke-virtual {v0}, [Lcom/beizi/ad/NativeAdResponse$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/beizi/ad/NativeAdResponse$b;

    return-object v0
.end method
