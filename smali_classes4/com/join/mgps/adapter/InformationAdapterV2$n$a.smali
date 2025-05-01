.class public Lcom/join/mgps/adapter/InformationAdapterV2$n$a;
.super Ljava/lang/Object;
.source "InformationAdapterV2.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/InformationAdapterV2$n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Lcom/join/mgps/dto/InformationCommentBeanV2;


# direct methods
.method public constructor <init>(Lcom/join/mgps/dto/InformationCommentBeanV2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/join/mgps/adapter/InformationAdapterV2$n$a;->a:Lcom/join/mgps/dto/InformationCommentBeanV2;

    return-void
.end method
