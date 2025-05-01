.class Lcom/join/mgps/fragment/CloudListFragmentV2$a;
.super Lcom/join/mgps/base/decoration/UniversalItemDecoration;
.source "CloudListFragmentV2.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/CloudListFragmentV2;->afterView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;

.field final synthetic b:Lcom/join/mgps/fragment/CloudListFragmentV2;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/CloudListFragmentV2;Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/CloudListFragmentV2$a;->b:Lcom/join/mgps/fragment/CloudListFragmentV2;

    iput-object p2, p0, Lcom/join/mgps/fragment/CloudListFragmentV2$a;->a:Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;

    invoke-direct {p0}, Lcom/join/mgps/base/decoration/UniversalItemDecoration;-><init>()V

    return-void
.end method


# virtual methods
.method public getItemOffsets(I)Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/fragment/CloudListFragmentV2$a;->a:Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;

    return-object p1
.end method
