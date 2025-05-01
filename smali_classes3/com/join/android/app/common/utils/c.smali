.class public final synthetic Lcom/join/android/app/common/utils/c;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/customview/o;

.field public final synthetic c:Lcom/join/mgps/db/tables/EMUApkTable;

.field public final synthetic d:Landroid/content/Context;

.field public final synthetic e:Landroid/widget/CheckBox;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/customview/o;Lcom/join/mgps/db/tables/EMUApkTable;Landroid/content/Context;Landroid/widget/CheckBox;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/android/app/common/utils/c;->b:Lcom/join/mgps/customview/o;

    iput-object p2, p0, Lcom/join/android/app/common/utils/c;->c:Lcom/join/mgps/db/tables/EMUApkTable;

    iput-object p3, p0, Lcom/join/android/app/common/utils/c;->d:Landroid/content/Context;

    iput-object p4, p0, Lcom/join/android/app/common/utils/c;->e:Landroid/widget/CheckBox;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    iget-object v0, p0, Lcom/join/android/app/common/utils/c;->b:Lcom/join/mgps/customview/o;

    iget-object v1, p0, Lcom/join/android/app/common/utils/c;->c:Lcom/join/mgps/db/tables/EMUApkTable;

    iget-object v2, p0, Lcom/join/android/app/common/utils/c;->d:Landroid/content/Context;

    iget-object v3, p0, Lcom/join/android/app/common/utils/c;->e:Landroid/widget/CheckBox;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/join/android/app/common/utils/APKUtils$Companion;->b(Lcom/join/mgps/customview/o;Lcom/join/mgps/db/tables/EMUApkTable;Landroid/content/Context;Landroid/widget/CheckBox;Landroid/view/View;)V

    return-void
.end method
