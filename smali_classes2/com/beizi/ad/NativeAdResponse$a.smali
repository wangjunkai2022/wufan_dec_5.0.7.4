.class public final enum Lcom/beizi/ad/NativeAdResponse$a;
.super Ljava/lang/Enum;
.source "NativeAdResponse.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/ad/NativeAdResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/beizi/ad/NativeAdResponse$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/beizi/ad/NativeAdResponse$a;

.field public static final enum b:Lcom/beizi/ad/NativeAdResponse$a;

.field public static final enum c:Lcom/beizi/ad/NativeAdResponse$a;

.field public static final enum d:Lcom/beizi/ad/NativeAdResponse$a;

.field private static final synthetic e:[Lcom/beizi/ad/NativeAdResponse$a;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lcom/beizi/ad/NativeAdResponse$a;

    const-string v1, "BeiZi"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/beizi/ad/NativeAdResponse$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/beizi/ad/NativeAdResponse$a;->a:Lcom/beizi/ad/NativeAdResponse$a;

    .line 2
    new-instance v1, Lcom/beizi/ad/NativeAdResponse$a;

    const-string v3, "BAIDU"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/beizi/ad/NativeAdResponse$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/beizi/ad/NativeAdResponse$a;->b:Lcom/beizi/ad/NativeAdResponse$a;

    .line 3
    new-instance v3, Lcom/beizi/ad/NativeAdResponse$a;

    const-string v5, "AFP"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/beizi/ad/NativeAdResponse$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/beizi/ad/NativeAdResponse$a;->c:Lcom/beizi/ad/NativeAdResponse$a;

    .line 4
    new-instance v5, Lcom/beizi/ad/NativeAdResponse$a;

    const-string v7, "GDT"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/beizi/ad/NativeAdResponse$a;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/beizi/ad/NativeAdResponse$a;->d:Lcom/beizi/ad/NativeAdResponse$a;

    const/4 v7, 0x4

    new-array v7, v7, [Lcom/beizi/ad/NativeAdResponse$a;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    .line 5
    sput-object v7, Lcom/beizi/ad/NativeAdResponse$a;->e:[Lcom/beizi/ad/NativeAdResponse$a;

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

.method public static valueOf(Ljava/lang/String;)Lcom/beizi/ad/NativeAdResponse$a;
    .locals 1

    .line 1
    const-class v0, Lcom/beizi/ad/NativeAdResponse$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/beizi/ad/NativeAdResponse$a;

    return-object p0
.end method

.method public static values()[Lcom/beizi/ad/NativeAdResponse$a;
    .locals 1

    .line 1
    sget-object v0, Lcom/beizi/ad/NativeAdResponse$a;->e:[Lcom/beizi/ad/NativeAdResponse$a;

    invoke-virtual {v0}, [Lcom/beizi/ad/NativeAdResponse$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/beizi/ad/NativeAdResponse$a;

    return-object v0
.end method
